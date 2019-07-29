package com.fernandohbrasil.dagger2example1.car;

import android.util.Log;

import com.fernandohbrasil.dagger2example1.dagger.Engine;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements Engine {

    private int horsePower;
    private int engineCapacity;

    @Inject
    public PetrolEngine(@Named("horse power") int horsePower,
                        @Named("engine capacity") int engineCapacity) {
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;

    }

    @Override
    public void start() {
        Log.d("Log: Petrol Engine",
                "\nHorse Power  " + horsePower +
                "\nEngine Capacity: " + engineCapacity);
    }
}