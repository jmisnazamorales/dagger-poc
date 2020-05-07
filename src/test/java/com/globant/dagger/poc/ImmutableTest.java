package com.globant.dagger.poc;

import com.globant.dagger.poc.entities.ImmutableUser;
import com.globant.dagger.poc.entities.User;
import org.junit.Assert;
import org.junit.Test;


public class ImmutableTest {

    @Test
    public void createImmutableUser() {
        final User user1 = ImmutableUser.builder().id("10").name("Julian").age(32).build();
        final User user2 = ImmutableUser.builder().id("20").name("Andres").age(32).build();

        Assert.assertNotEquals(user1, user2);
    }

    @Test
    public void createByConstructor(){
        //ImmutableUser user = ImmutableUser.of("10","John", 42);
        //Assert.assertNotNull(user);
    }

    @Test
    public void createWithAuxiliary(){
        final User user1 = ImmutableUser.builder().id("10").name("Julian").age(32).rol("dev").build();
        final User user2 = ImmutableUser.builder().id("10").name("Julian").age(32).rol("qa"). build();
        Assert.assertEquals(user1, user2);
    }

    @Test
    public void copyFromUser(){
        final User user1 = ImmutableUser.builder().id("10").name("Julian").age(32).rol("dev").build();
        final User user2 = ImmutableUser.builder().from(user1).rol("manager").build();
        Assert.assertEquals(user1, user2);
    }
}
