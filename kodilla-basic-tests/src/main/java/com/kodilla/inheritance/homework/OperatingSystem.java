package com.kodilla.inheritance.homework;

public class OperatingSystem extends Computer {
    boolean turnOn = false;


    void turnOn () {

        turnOn = !turnOn;
        if (turnOn)

        System.out.println("System został uruchomiony");
else
        System.out.println("System został zamkniety");


    }


}
