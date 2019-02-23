package com.wheejuni.daggerpractice.application.util;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RandomNumberUtilTest {

    private RandomNumberUtil util;

    @Before
    public void setUp() {
        this.util = new RandomNumberUtil();
    }

    @Test
    public void test_generate_random_int() {
        int random = util.getRandomNumber();

        System.out.println(random);
        assertTrue(random < 6);
    }

}