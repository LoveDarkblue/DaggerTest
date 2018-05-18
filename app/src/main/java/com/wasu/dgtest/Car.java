package com.wasu.dgtest;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by Aislli on 2018/5/18 0018.
 */
public class Car {
    Tire tire;
    IEngin engin;

    @Inject
    public Car(Tire tire, @Named("BEngin") IEngin engin) {
        this.tire = tire;
        this.engin = engin;
    }

    public String getStr() {
        return "This Car";
    }
}
