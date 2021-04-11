package com.kodilla.collections.homework;

public class Mazda implements Car {

    private int speed;

    public Mazda( int speed){
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }
    public void increaseSpeed() {
        this.speed +=55;
    }

    @Override
    public String toString() {
        return "Mazda{" +
                "speed=" + speed +
                '}';
    }

    public void decreaseSpeed() {
        this.speed -= 23;

    }


}
