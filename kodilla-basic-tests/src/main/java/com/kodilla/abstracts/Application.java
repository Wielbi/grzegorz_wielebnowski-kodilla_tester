package com.kodilla.abstracts;

import com.kodilla.abstracts.homework.Triangle;

public class Application {
    public static void main(String[] args) {

       Animal dog = new Dog();
       dog.giveVoice();

       Duck duck = new Duck();
       duck.giveVoice();

        AnimalProcessor processor = new AnimalProcessor();
        processor.process(dog);

       }



    }

