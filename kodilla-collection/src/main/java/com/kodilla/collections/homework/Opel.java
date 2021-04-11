package com.kodilla.collections.homework;

public class Opel implements Car {
    private int speed;

    public Opel(int speed){
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void increaseSpeed() {
        this.speed +=44;

    }

    @Override
    public String toString() {
        return "Opel{" +
                "speed=" + speed +
                '}';
    }

    public void decreaseSpeed() {
       this.speed -=23;

    }


}
