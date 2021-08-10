package com.echo.ivideo.base;

public interface IBasePresenter<V extends IBaseView> {
    void attachView(V v);
    void detachView();
}
