package com.wasu.dgtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainActivityComponent.create().inject(this);
        Log.i("TAG", car.getStr() + " has " + car.tire.getStr() + ", it uses the " + car.engin.name());
        car.engin.start();
        car.shell.showColor();
    }
}
