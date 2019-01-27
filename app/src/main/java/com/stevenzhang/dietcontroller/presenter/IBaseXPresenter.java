package com.stevenzhang.dietcontroller.presenter;

public interface IBaseXPresenter {
    /**
     * 判断presenter是否与view建立联系，防止内存泄漏
     *
     * @return {@code true}: 联系已建立
     * {@code false}: 联系已断开
     */
    boolean isViewAttach();

    /**
     * 断开presenter与view的联系
     */
    void detachView();
}
