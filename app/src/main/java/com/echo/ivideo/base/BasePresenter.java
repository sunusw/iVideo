package com.echo.ivideo.base;

public abstract class BasePresenter<V extends IBaseView> implements IBasePresenter<V> {
    protected V mView;

    @Override
    public void attachView(V view) {
        this.mView = view;
    }
}
