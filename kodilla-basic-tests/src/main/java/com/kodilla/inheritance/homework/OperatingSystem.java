package com.kodilla.inheritance.homework;

public class OperatingSystem extends Computer {
    boolean turnOn = true;
    boolean turnOf = false;



    void turnOn () {

        turnOn = !turnOn;
        if (turnOn)
            turnOf = !turnOf;
        if (turnOf)

        System.out.println("System został uruchomiony");
else
        System.out.println("System został zamkniety");


    }


}
