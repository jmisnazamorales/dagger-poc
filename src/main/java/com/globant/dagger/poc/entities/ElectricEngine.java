package com.globant.dagger.poc.entities;

import com.globant.dagger.poc.entities.Engine;

import javax.inject.Inject;

public class ElectricEngine implements Engine {

    @Inject
    public ElectricEngine(){}

    @Override
    public void startEngine() {
        System.out.println("Started electric engine!!! Rules");
    }
}

