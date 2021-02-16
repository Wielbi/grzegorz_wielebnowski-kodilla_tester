package com.kodilla.collections.homework;

public class CarRace {
    public static void main(String[] args) {


        Fiat fiat = new Fiat(54);
        doRace(fiat);

        Opel opel = new Opel(11);
        doRace(opel);

        Mazda mazda = new Mazda(21);
        doRace(mazda);

    }

    private static void doRace(Mazda mazda) {
        mazda.increaseSpeed();
        mazda.increaseSpeed();
        mazda.increaseSpeed();
        mazda.decreaseSpeed();
        mazda.decreaseSpeed();
        System.out.println(mazda.getSpeed());
    }

    private static void doRace(Fiat fiat) {
        fiat.increaseSpeed();
        fiat.increaseSpeed();
        fiat.increaseSpeed();
        fiat.decreaseSpeed();
        fiat.decreaseSpeed();
        System.out.println(fiat.getSpeed());


    }

    private static void doRace(Opel opel){
        opel.increaseSpeed();
        opel.increaseSpeed();
        opel.increaseSpeed();
        opel.decreaseSpeed();
        opel.decreaseSpeed();
        System.out.println(opel.getSpeed());
    }
}







