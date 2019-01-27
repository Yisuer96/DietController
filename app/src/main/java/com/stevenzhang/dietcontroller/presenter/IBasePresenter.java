package com.stevenzhang.dietcontroller.presenter;

public interface IBasePresenter extends IBaseXPresenter {
    /**
     * 取消网络请求
     *
     * @param tag
     */
    void cancel(Object tag);

    /**
     * 取消所有网络请求
     */
    void cancelAll();

}
