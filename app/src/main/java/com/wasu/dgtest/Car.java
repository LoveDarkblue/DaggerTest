package com.wasu.dgtest;

import com.wasu.dgtest.inter.ColorShell;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by Aislli on 2018/5/18 0018.
 */
public class Car {
    Tire tire;
    IEngin engin;
    Shell shell;

    @Inject
    public Car(Tire tire, @Named("BEngin") IEngin engin, @ColorShell("red") Shell shell) {
        this.tire = tire;
        this.engin = engin;
        this.shell = shell;
    }

    public String getStr() {
        return "This Car";
    }
}
