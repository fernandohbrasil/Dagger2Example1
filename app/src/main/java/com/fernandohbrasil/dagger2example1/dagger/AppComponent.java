package com.fernandohbrasil.dagger2example1.dagger;

import com.fernandohbrasil.dagger2example1.car.DieselEngine;
import com.fernandohbrasil.dagger2example1.car.Driver;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {
    ActivityComponent getActivityComponent(DieselEngineModule dieselEngineModule);

}
