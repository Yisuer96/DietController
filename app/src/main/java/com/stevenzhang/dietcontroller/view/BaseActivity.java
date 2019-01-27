package com.stevenzhang.dietcontroller.view;

import android.widget.ProgressBar;
import com.stevenzhang.dietcontroller.presenter.IBasePresenter;

public abstract class BaseActivity<P extends IBasePresenter> extends BaseXActivity<P> implements IBaseView {
    private ProgressBar mProgressBar;

    @Override
    public void showLoading() {
        /**
         * 显示正在加载
         */
    }

    @Override
    public void hideLoading() {
        /**
         * 隐藏加载条
         */
    }

    @Override
    public void showToast(String msg) {
        /**
         * 显示提示
         */
    }

    @Override
    public void onDestroy() {
        hideLoading();
        super.onDestroy();
    }


}
