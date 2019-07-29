package com.fernandohbrasil.dagger2example1.dagger;


import com.fernandohbrasil.dagger2example1.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);

}
