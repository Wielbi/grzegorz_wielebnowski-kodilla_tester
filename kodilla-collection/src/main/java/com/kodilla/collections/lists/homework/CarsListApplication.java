package com.kodilla.collections.lists.homework;


import com.kodilla.collections.homework.Car;
import com.kodilla.collections.homework.Fiat;
import com.kodilla.collections.homework.Mazda;
import com.kodilla.collections.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Fiat(63));
        cars.add(new Opel(112));
        cars.add(new Mazda(96));

        for (Car car : cars) {
            if (car.getSpeed() > 75)
                System.out.println(cars + " ,speed " + car.getSpeed());

        }
    }
}
