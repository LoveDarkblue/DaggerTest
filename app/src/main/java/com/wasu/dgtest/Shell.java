package com.wasu.dgtest;

import android.util.Log;

/**
 * Created by Aislli on 2018/5/18 0018.
 */
public class Shell {
    private String color = "white";

    public Shell() {
    }

    public Shell(String color) {
        this.color = color;
    }

    public void showColor() {
        Log.i("TAG", "the shell is " + color);
    }
}
