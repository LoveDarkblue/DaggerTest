package com.wasu.dgtest;

import android.util.Log;

/**
 * Created by Aislli on 2018/5/18 0018.
 */
public class AEngin implements IEngin {

    @Override
    public String name() {
        return "A Engin";
    }

    @Override
    public void start() {
        Log.i("TAG", "A Engin is start!");
    }
}
