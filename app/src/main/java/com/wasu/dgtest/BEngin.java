package com.wasu.dgtest;

import android.util.Log;

/**
 * Created by Aislli on 2018/5/18 0018.
 */
public class BEngin implements IEngin {
    @Override
    public String name() {
        return "B Engin";
    }

    @Override
    public void start() {
        Log.i("TAG", "B Engin is start!");
    }
}
