package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.homework.Fiat;
import com.kodilla.collections.homework.Mazda;
import com.kodilla.collections.homework.Opel;
import com.kodilla.collections.homework.Car;

import java.util.Random;

public class CarsApplication {


    Random random = new Random();
    int drawNumber = random.nextInt(15);


    public static void main(String[] args) {
        Car[] cars = new Car[3];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = drawCar();
        }
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }

    private static Car drawCar() {
        Random random = new Random();
        int drawCar = random.nextInt(3);
        double a = random.nextDouble() * 15 + 1;
        double b = random.nextDouble() * 15 + 1;
        double c = random.nextDouble() * 15 + 1;
        if (drawCar == 0)
            return new Fiat(63);
        else if (drawCar == 1)
            return new Opel(74);
        else
            return new Mazda(55);


    }

}

