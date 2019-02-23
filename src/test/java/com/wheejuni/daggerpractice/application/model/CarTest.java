package com.wheejuni.daggerpractice.application.model;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CarTest {

    private Car car;

    @Before
    public void setUp() {
        Player player = new Player("박재성");

        this.car = new Car(0, player);
    }

    @Test
    public void test_position_increase() {
        this.car.increasePosition(3);

        assertThat(this.car.getPosition(), is(3));
    }

}