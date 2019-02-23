package com.wheejuni.daggerpractice.application.util;


import java.util.Random;

public class RandomNumberUtil {
    private static final int MAX_PLAYER_COUNT = 6;
    private final Random random = new Random();

    public int getRandomNumber() {
        return random.ints(0, MAX_PLAYER_COUNT).findFirst()
                .orElseThrow(() -> new UnsupportedOperationException("random 넘버 생성중 에러 발생"));
    }
}
