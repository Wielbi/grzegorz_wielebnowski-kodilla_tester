package com.kodilla.abstracts.homework;

public abstract class Shape {

    protected abstract void countArea();

    double area = -1;

    public double getArea() {

        if (area == -1) {
            countArea();
        }
        return area;

    }

    public String tuString() {
        return "area:" +  getArea();

        }

    }







