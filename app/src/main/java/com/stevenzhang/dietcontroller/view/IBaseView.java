package com.stevenzhang.dietcontroller.view;

import com.stevenzhang.dietcontroller.view.IBaseXView;

public interface IBaseView extends IBaseXView {
    void showLoading();

    void hideLoading();

    void showToast(String msg);
}
