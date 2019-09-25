package com.dotplays.quanlysach.activity;

import android.os.Bundle;
import android.view.View;

import com.dotplays.quanlysach.R;
import com.dotplays.quanlysach.activity.base.BaseActivity;

public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }


    public void login(View view) {
        openActivity(LoginActivity.class);
    }
}
