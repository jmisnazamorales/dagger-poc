package com.globant.dagger.poc;

import com.globant.dagger.poc.entities.Car;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class DaggerTest {

    private Car car;

    private CarComponent component;

    @Before
    public void init(){
        component = DaggerCarComponent.create();
        car = component.buildCar();
    }

    @Test
    public void buildingCar() {
        Car carOne = component.buildCar();
        Assert.assertNotNull(carOne);

    }

    @Test
    public void testDrive(){
        car.drive();
    }
}
