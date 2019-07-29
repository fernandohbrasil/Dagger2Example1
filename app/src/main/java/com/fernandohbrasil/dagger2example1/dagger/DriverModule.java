package com.fernandohbrasil.dagger2example1.dagger;

import com.fernandohbrasil.dagger2example1.car.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class DriverModule {

    @Provides
    @Singleton
    static Driver provideDriver() {
        return new Driver();
    }
}