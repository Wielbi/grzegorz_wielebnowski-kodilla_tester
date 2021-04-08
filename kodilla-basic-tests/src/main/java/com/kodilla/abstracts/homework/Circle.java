package com.kodilla.abstracts.homework;

public class Circle extends Shape {

public double PI = 3.14;
public double R;

    public Circle(double R) {
       this.R = R;

    }

    @Override
    public double getArea() {
        return PI* R*R;

    }

    @Override
    public double getCircuit() {
        return 2 * PI *R;
    }
}




