package com.stevenzhang.dietcontroller.presenter;

import android.support.annotation.NonNull;
import com.stevenzhang.dietcontroller.view.IBaseXView;

import java.lang.ref.WeakReference;

public class BaseXPresenterImpl<V extends IBaseXView> implements IBaseXPresenter {
    private WeakReference<V> mViewRef;

    protected BaseXPresenterImpl(@NonNull V view) {
        attachView(view);
    }

    private void attachView(V view) {
        mViewRef = new WeakReference<V>(view);
    }

    public V getView() {
        return mViewRef.get();
    }

    @Override
    public boolean isViewAttach() {
        return mViewRef != null && mViewRef.get() != null;
    }

    @Override
    public void detachView() {
        if (mViewRef != null) {
            mViewRef.clear();
            mViewRef = null;
        }
    }
}
