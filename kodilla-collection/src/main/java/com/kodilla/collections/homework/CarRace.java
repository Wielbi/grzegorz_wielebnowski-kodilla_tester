package com.kodilla.collections.homework;

public class CarRace {
    public static void main(String[] args) {


        Fiat fiat = new Fiat(63);
        doRace(fiat);

        Opel opel = new Opel(112);
        doRace(opel);

        Mazda mazda = new Mazda(96);
        doRace(mazda);

    }

    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }


}








