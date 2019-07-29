package com.fernandohbrasil.dagger2example1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.fernandohbrasil.dagger2example1.car.Car;
import com.fernandohbrasil.dagger2example1.dagger.ActivityComponent;
import com.fernandohbrasil.dagger2example1.dagger.DieselEngineModule;


import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject Car car1, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityComponent component = ((ExampleApp) getApplication()).getAppComponent()
                .getActivityComponent(new DieselEngineModule(120));

        component.inject(this);

        car1.drive();
        car2.drive();
    }
}
