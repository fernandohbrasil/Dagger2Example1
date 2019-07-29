package com.fernandohbrasil.dagger2example1.car;

import android.util.Log;

import javax.inject.Inject;

public class Remote {

    @Inject
    public Remote() {

    }

    public void setListener(Car car) {
        Log.d("Log: Remote", "Connected");
    }
}