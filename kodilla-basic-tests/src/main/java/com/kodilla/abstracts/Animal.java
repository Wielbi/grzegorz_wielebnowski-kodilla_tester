package com.kodilla.abstracts;

public abstract class Animal {
    private int numberOflegs;
    private int numberOfLegs;

    public Animal(int numberOflegs) {
        this.numberOflegs = numberOflegs;

    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }
    public abstract void giveVoice();
}




