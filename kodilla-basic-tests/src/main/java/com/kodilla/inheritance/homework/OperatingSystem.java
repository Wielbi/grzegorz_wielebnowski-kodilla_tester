package com.kodilla.inheritance.homework;

public class OperatingSystem  {
    private boolean isOn = false;
    private int releaseYear;

    public OperatingSystem(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    void turnOn() {
        if (isOn) {
            System.out.println("Operating system is already on!");
        } else {
            isOn = true;
            System.out.println("Turning on OS");
        }
    }

    void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println("Turning off OS");
        } else {
            System.out.println("Operating system is already off!");
        }
    }


}
