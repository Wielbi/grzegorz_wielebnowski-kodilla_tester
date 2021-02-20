package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {

        Set<Stamp>stamps= new HashSet<>();
        stamps.add(new Stamp("Papieski", "stempel",2,4));
        stamps.add(new Stamp("Jan","stempel",3,4));
        stamps.add(new Stamp("Piłsudski","brak stempla",3,5));
        stamps.add(new Stamp("Kowalski","brak stempla",3,7));
        stamps.add(new Stamp("Jan","stempel",3,4));

        System.out.println(stamps.size());
        for (Stamp stamp: stamps){
            System.out.println(stamp);
        }
    }
}
