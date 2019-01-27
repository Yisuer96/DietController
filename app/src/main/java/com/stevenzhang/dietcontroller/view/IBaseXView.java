package com.stevenzhang.dietcontroller.view;

import android.app.Activity;

public interface IBaseXView {
    /**
     * 获取activity对象
     *
     * @param <T>
     * @return activity
     */
    <T extends Activity> T getSelfActivity();
}
