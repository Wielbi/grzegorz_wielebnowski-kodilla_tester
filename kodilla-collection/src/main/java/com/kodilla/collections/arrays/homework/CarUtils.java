package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.homework.Fiat;
import com.kodilla.collections.homework.Mazda;
import com.kodilla.collections.homework.Opel;
import com.kodilla.collections.homework.Car;

public class CarUtils {
    public static void describeCar(Car car) {

        System.out.println("__________________________");
        System.out.println("Car describe: " + getCarName(car));
        System.out.println("Car speed " + car.getSpeed());

    }

    private static String getCarName(Car car) {
        if (car instanceof Fiat)
            return "Fiat";
        else if (car instanceof Opel)
            return "Opel";
        else if (car instanceof Mazda)
            return "Mazda";
        else
            return "Unknown car name ";

    }



}




