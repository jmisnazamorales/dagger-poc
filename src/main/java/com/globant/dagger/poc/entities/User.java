package com.globant.dagger.poc.entities;

import org.immutables.value.Value;

@Value.Immutable
public interface User {

        //@Value.Parameter
        String id();

        //@Value.Parameter
        String name();

        //@Value.Parameter
        int age();

        @Value.Auxiliary
        String rol();
}
