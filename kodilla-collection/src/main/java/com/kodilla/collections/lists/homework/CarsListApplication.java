package com.kodilla.collections.lists.homework;


import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.homework.Car;
import com.kodilla.collections.homework.Fiat;
import com.kodilla.collections.homework.Mazda;
import com.kodilla.collections.homework.Opel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarsListApplication {
    Random random = new Random();


    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Opel opel = new Opel(112);

        cars.add(opel);


        cars.add(new Fiat(63));
        cars.add(new Opel(112));
        cars.add(new Mazda(96));

        cars.remove(1);

        boolean remove = cars.remove(opel);

        System.out.println(cars.size());
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }
}
