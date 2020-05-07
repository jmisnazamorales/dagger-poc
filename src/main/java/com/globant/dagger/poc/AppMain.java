package com.globant.dagger.poc;

import com.globant.dagger.poc.entities.Car;

import javax.inject.Inject;

public class AppMain {

    @Inject
    Car car;

    public static void main( String args[] ){
        AppMain app = new AppMain();
        app.test();
    }


    private void test(){
        CarComponent component = DaggerCarComponent.create();
        //component.inject(this);
        car.drive();
    }
}
