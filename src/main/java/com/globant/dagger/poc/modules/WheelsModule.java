package com.globant.dagger.poc.modules;

import com.globant.dagger.poc.entities.Rims;
import com.globant.dagger.poc.entities.Tires;
import com.globant.dagger.poc.entities.Wheels;
import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    @Provides
    static Rims buildRims(){
        return new Rims();
    }

    @Provides
    static Tires buildTires(){
        Tires tire = new Tires();
        tire.inflate();
        return tire;
    }


    @Provides
    Wheels buildWheels( Tires tires, Rims rims ){
        return new Wheels(tires, rims);
    }

}
