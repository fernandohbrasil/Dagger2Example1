package com.fernandohbrasil.dagger2example1.car;

import android.util.Log;

public class Tires {
    //we don't own this class so we can't annotate it with @Inject

    public void inflate() {
        Log.d("Log: ", "Tires inflated");
    }
}