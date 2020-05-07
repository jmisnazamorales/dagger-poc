package com.globant.dagger.poc;

import com.globant.dagger.poc.entities.Car;
import com.globant.dagger.poc.modules.ElectricEngineModule;
import com.globant.dagger.poc.modules.WheelsModule;
import dagger.Component;

import javax.inject.Singleton;

//@Singleton
@Component( modules = {WheelsModule.class, ElectricEngineModule.class})
//@Component ( modules = WheelsModule.class)
//@Component
public interface CarComponent {

    Car buildCar();

}
