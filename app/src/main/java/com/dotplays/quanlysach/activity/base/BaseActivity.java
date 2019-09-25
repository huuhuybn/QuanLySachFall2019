package com.dotplays.quanlysach.activity.base;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {


    public void openActivity(Class target) {

        Intent intent = new Intent(this, target);
        startActivity(intent);

    }




}
