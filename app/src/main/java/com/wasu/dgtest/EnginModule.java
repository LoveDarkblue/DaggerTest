package com.wasu.dgtest;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Aislli on 2018/5/18 0018.
 */
@Module
public class EnginModule {

    @Provides
    @Named("AEngin")
    IEngin a() {
        return new AEngin();
    }

    @Provides
    @Named("BEngin")
    IEngin b(){
        return new BEngin();
    }
}
