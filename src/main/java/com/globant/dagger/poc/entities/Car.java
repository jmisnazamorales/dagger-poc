package com.globant.dagger.poc.entities;

import javax.inject.Inject;

public class Car {

    /*
    private final Engine engine;

    @Inject
    public Car(Engine engine) {
        this.engine = engine;
    }

     */

    @Inject
    public Car() { }

    public void drive(){
        //engine.startEngine();
        System.out.println("Im driving");
    }

    /*
    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }
     */
}