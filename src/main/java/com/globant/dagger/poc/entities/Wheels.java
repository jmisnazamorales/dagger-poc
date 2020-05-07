package com.globant.dagger.poc.entities;

public class Wheels {

    private Tires tires;

    private Rims rim;

    public Wheels(Tires tires, Rims rims ){
        this.tires = tires;
        this.rim = rims;
    }
}
