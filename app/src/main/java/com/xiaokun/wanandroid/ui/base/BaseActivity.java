package com.xiaokun.wanandroid.ui.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

/**
 * <pre>
 *     作者   : 肖坤
 *     时间   : 2018/03/14
 *     描述   :
 *     版本   : 1.0
 * </pre>
 */

public class BaseActivity extends AppCompatActivity implements MvpView
{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected void attachBaseContext(Context newBase)
    {
        //add custom font android using lib
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override
    public void showLoading()
    {

    }

    @Override
    public void hideLoading()
    {

    }

    @Override
    public void openActivityOnTokenExpire()
    {

    }

    @Override
    public void onError(@StringRes int resId)
    {

    }

    @Override
    public void onError(String message)
    {

    }

    @Override
    public void showMessage(String message)
    {

    }

    @Override
    public void showMessge(@StringRes int resId)
    {

    }

    @Override
    public boolean isNetworkConneted()
    {
        return false;
    }

    @Override
    public void hideKeyboard()
    {

    }
}
