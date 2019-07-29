package com.fernandohbrasil.dagger2example1.dagger;

import com.fernandohbrasil.dagger2example1.car.Rims;
import com.fernandohbrasil.dagger2example1.car.Tires;
import com.fernandohbrasil.dagger2example1.car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class WheelsModule {

    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tires provideTires() {
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires) {
        return new Wheels(rims, tires);
    }
}