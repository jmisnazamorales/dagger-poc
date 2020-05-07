package com.globant.dagger.poc.entities;

import javax.inject.Inject;

public class GasEngine implements Engine{

    @Inject
    public GasEngine(){}

    @Override
    public void startEngine() {
        System.out.println("Start gas engine");
    }
}
