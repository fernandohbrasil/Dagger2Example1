package com.fernandohbrasil.dagger2example1;


import android.app.Application;

import com.fernandohbrasil.dagger2example1.dagger.ActivityComponent;
import com.fernandohbrasil.dagger2example1.dagger.AppComponent;
import com.fernandohbrasil.dagger2example1.dagger.DaggerAppComponent;


public class ExampleApp extends Application {

    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerAppComponent.create();
    }

    public AppComponent getAppComponent() {
        return component;
    }
}
