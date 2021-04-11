package com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    public double H;
    public double A;
    public  double B;
    public double C;


    public Triangle(double h, double a,double b, double c) {
        H = h;
        A = a;
        B = b;
        C = c;

    }

    @Override
    public double getArea() {
        return 0.5 * A * H ;

    }

    @Override
    public double getCircuit() {
        return A + B + C ;
    }
}