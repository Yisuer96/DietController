package com.stevenzhang.dietcontroller.view;

import android.app.Activity;
import com.stevenzhang.dietcontroller.presenter.IBaseXPresenter;

public abstract class BaseXActivity<P extends IBaseXPresenter> extends Activity implements IBaseXView {
    private P mPresenter;

    /**
     * 创建presenter
     *
     * @return
     */
    public abstract P onBindPresenter();

    /**
     * @return 获取presenter对象，懒加载
     */
    public P getPresenter() {
        if (mPresenter == null) {
            mPresenter = onBindPresenter();
        }
        return mPresenter;
    }

    @Override
    public Activity getSelfActivity() {
        return this;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        /**
         * 生命周期结束时，断开连接，防止内存溢出
         */
        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }
}
