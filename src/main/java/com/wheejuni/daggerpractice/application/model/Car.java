package com.wheejuni.daggerpractice.application.model;

public class Car {

    private int position;
    private Player owner;

    public Car(int position, Player owner) {
        this.position = position;
        this.owner = owner;
    }

    public void increasePosition(int speed) {
        this.position += speed;
    }

    public String getPlayerName() {
        return this.owner.getName();
    }

    public int getPosition() {
        return this.position;
    }
}
