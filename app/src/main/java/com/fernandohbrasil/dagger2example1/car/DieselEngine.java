package com.fernandohbrasil.dagger2example1.car;

import android.util.Log;

import com.fernandohbrasil.dagger2example1.dagger.Engine;

import javax.inject.Inject;

public class DieselEngine implements Engine {

    private int horsePower;

    @Inject
    public DieselEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        Log.d("Log: Diesel Engine", "Full: Horse power: " + horsePower);
    }

}
