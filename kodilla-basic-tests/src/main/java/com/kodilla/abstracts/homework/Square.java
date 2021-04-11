package com.kodilla.abstracts.homework;

public class Square extends Shape {
    public double A;


    public Square(double a) {
        A = a;

    }

    @Override
    public double getArea() {
        return A * A;
    }

    @Override
    public double getCircuit() {
        return 4 * A;
    }
}
