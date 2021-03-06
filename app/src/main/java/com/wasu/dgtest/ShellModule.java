package com.wasu.dgtest;

import com.wasu.dgtest.inter.BlackShell;
import com.wasu.dgtest.inter.ColorShell;
import com.wasu.dgtest.inter.NormalShell;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Aislli on 2018/5/18 0018.
 */
@Module
public class ShellModule {
    @Provides
    @NormalShell
    Shell normalShell(){
        return new Shell();
    }

    @Provides
    @BlackShell
    Shell blackShell() {
        return new Shell("black");
    }

    @Provides
    @ColorShell()
    Shell normalShell1(){
        return new Shell();
    }

    @Provides
    @ColorShell("red")
    Shell redShell(){
        return new Shell("red");
    }

}
