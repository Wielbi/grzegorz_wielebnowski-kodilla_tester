package com.kodilla.collections.homework;

public class Fiat implements Car {
    private int speed;

    public Fiat( int speed){
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }

    public void increaseSpeed() {
        this.speed +=10;
    }

    public void decreaseSpeed() {
        this.speed -=10;

    }
}
