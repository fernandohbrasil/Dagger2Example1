package com.fernandohbrasil.dagger2example1.dagger;

import com.fernandohbrasil.dagger2example1.MainActivity;
import com.fernandohbrasil.dagger2example1.car.Car;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

@PerActivity
@Subcomponent(modules = {WheelsModule.class, DieselEngineModule.class})
public interface ActivityComponent { //the injector
    Car getCar();

    void inject (MainActivity mainActivity);

    /*
    @Component.Builder
    interface Builder{
        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        Builder appComponent(AppComponent component);

        ActivityComponent build();
    }
    */
}
