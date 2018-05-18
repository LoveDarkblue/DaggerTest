package com.wasu.dgtest;

import dagger.Component;

/**
 * Created by Aislli on 2018/5/17 0017.
 */
@Component(modules = {EnginModule.class, ShellModule.class})
public interface MainActivityComponent {
    void inject(MainActivity activity);
}
