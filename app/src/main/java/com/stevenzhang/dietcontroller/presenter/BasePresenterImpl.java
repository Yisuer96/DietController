package com.stevenzhang.dietcontroller.presenter;

import android.support.annotation.NonNull;
import com.stevenzhang.dietcontroller.view.IBaseView;

public abstract class BasePresenterImpl<V extends IBaseView, T> extends BaseXPresenterImpl<V> implements IBasePresenter, HttpResponseListener<T> {
    public BasePresenterImpl(@NonNull V view) {
        super(view);
    }

    @Override
    public void cancel(@NonNull Object tag) {
        /**
         * 取消网络请求
         */
    }

    @Override
    public void cancelAll() {
        /**
         * 取消所有网络请求
         */
    }

    @Override
    public void onSuccess(Object tag, T t) {
        /**
         * 网络请求成功
         */
    }

//    @Override
//    public void onFailure(Object tag, HttpFailure httpFailure) {
//        /**
//         * 网络请求失败
//         */
//    }
}
