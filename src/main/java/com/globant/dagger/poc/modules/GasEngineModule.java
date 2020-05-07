package com.globant.dagger.poc.modules;

import com.globant.dagger.poc.entities.Engine;
import com.globant.dagger.poc.entities.GasEngine;
import dagger.Module;
import dagger.Provides;

@Module
public class GasEngineModule {

    @Provides
    Engine buildGasEngine(GasEngine engine){
        return engine;
    }
}
