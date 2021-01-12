package com.kodilla.inheritance.homework;

public class Runner {
    public static void main(String[] args) {

        OperatingSystem windowsXP = new WindowsXP();
        OperatingSystem windows10 = new Windows10();

        windowsXP.turnOn();
        windowsXP.turnOn();
        windowsXP.turnOff();

        windows10.turnOff();
        windows10.turnOn();
        windows10.turnOff();
    }
}
