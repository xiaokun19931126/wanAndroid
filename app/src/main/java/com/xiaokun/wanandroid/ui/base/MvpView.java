package com.xiaokun.wanandroid.ui.base;

import android.support.annotation.StringRes;

/**
 * <pre>
 *     作者   : 肖坤
 *     时间   : 2018/03/14
 *     描述   :
 *     版本   : 1.0
 * </pre>
 */

public interface MvpView
{
    void showLoading();

    void hideLoading();

    //token过期后的逻辑操作
    void openActivityOnTokenExpire();

    void onError(@StringRes int resId);

    void onError(String message);

    void showMessage(String message);

    void showMessge(@StringRes int resId);

    boolean isNetworkConneted();

    void hideKeyboard();
}
