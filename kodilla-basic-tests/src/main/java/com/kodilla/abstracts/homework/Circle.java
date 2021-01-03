package com.kodilla.abstracts.homework;

public class Circle extends Shape {

    private double ray;

    public Circle(double ray) {
        this.ray = ray;

    }


    @Override
    protected void countArea() {
        super.area = Math.PI * ray * ray;

    }

    public String toString() {

        return super.tuString() + " type: circle";
    }

    public static void main(String[] args) {
        Circle roundy = new Circle(3.4);

        System.out.println(roundy.toString());

    }
}





