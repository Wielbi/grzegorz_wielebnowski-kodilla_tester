package com.kodilla.abstracts.homework;

public class Triangle extends Shape {

    private double base;
    private double height;

    public Triangle(double b, double h) {
        base = b;
        height = h;
    }

    @Override
    protected void countArea() {
        super.area = 0.5 * height * base;

    }

    public String toString() {
        return super.toString() + "type: triangle";

    }

    public static void main(String[] args) {
        Triangle a = new Triangle(4.1, 3.9);

        System.out.println(a.getArea());
    }
}

