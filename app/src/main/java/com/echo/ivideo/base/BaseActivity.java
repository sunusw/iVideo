package com.echo.ivideo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.echo.ivideo.R;

public abstract class BaseActivity<P extends IBasePresenter> extends AppCompatActivity implements IBaseView{

    //P层的应用
    protected P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());

        //初始化mPresenter
        initPresenter();

        //绑定view
        if(mPresenter != null){
            mPresenter.attachView(this);
        }
        //初始化
        initView();
    }

    /**
     * 初始化mPresenter
     */
    protected abstract void initPresenter();

    /**
     * 初始化
     */
    protected abstract void initView();

    /**
     * 获取布局id
     * @return
     */
    protected abstract int getLayoutId();
}
