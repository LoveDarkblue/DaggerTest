package com.wasu.dgtest.inter;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by Aislli on 2018/5/18 0018.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface ColorShell {
    String value() default "";
}
