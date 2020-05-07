package com.globant.dagger.poc.entities;

import javax.inject.Inject;

public class Remote {

    @Inject
    public Remote(){}

    public void setListener(Car car){
        System.out.println("Enable remote control" + car.toString());
    }
}
