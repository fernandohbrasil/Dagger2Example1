package com.fernandohbrasil.dagger2example1.car;

import android.util.Log;

import com.fernandohbrasil.dagger2example1.dagger.Engine;
import com.fernandohbrasil.dagger2example1.dagger.PerActivity;

import javax.inject.Inject;

@PerActivity
public class Car {
    private static final String TAG = "Car";

    private Driver driver;
    private Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Driver driver, Engine engine, Wheels wheels) {
        this.driver = driver;
        this.engine = engine;
        this.wheels = wheels;
    }

    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }

    public void drive() {
        engine.start();
        Log.d("Log: " + TAG, "  " + driver + "   driving..." + this);
    }
}