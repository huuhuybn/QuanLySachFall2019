package com.dotplays.quanlysach.activity;

import android.os.Bundle;
import android.view.View;

import com.dotplays.quanlysach.R;
import com.dotplays.quanlysach.activity.base.BaseActivity;

public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void openHome(View view) {
        openActivity(HomeActivity.class);
    }

}
