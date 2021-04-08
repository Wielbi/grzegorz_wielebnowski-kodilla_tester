package com.kodilla.abstracts;

import com.kodilla.abstracts.homework.*;

public class Application {
    public static void main(String[] args) {

//       Animal dog = new Dog();
//       dog.giveVoice();
//
//       Duck duck = new Duck();
//       duck.giveVoice();
//
//        AnimalProcessor processor = new AnimalProcessor();
//        processor.process(dog);

        Shape circle = new Circle(5);
        System.out.println(circle.getArea());
        System.out.println(circle.getCircuit());
        Shape triangle = new Triangle(3,5,4,3);
        System.out.println(triangle.getCircuit());
        System.out.println(triangle.getArea());
        Shape square = new Square(5);
        System.out.println(square.getArea());
        System.out.println(square.getCircuit());

        Person person = new Person("Grzegorz",40,new Medical(1111,"Kierowanie Karetką"));
        System.out.println(person.getResponsibilities());

       }



    }

