package com.globant.dagger.poc.modules;

import com.globant.dagger.poc.entities.ElectricEngine;
import com.globant.dagger.poc.entities.Engine;
import dagger.Binds;
import dagger.Module;

@Module
/*
public class ElectricEngineModule {


    @Provides
    Engine buildEngine(ElectricEngine engine){
        return engine;
    }
}
 */
public abstract class ElectricEngineModule {


    @Binds
    abstract Engine bindEngine(ElectricEngine engine);
}

