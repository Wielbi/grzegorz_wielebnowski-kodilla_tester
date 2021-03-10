package com.kodilla.collections.adv.maps.homework;



import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<School, Principal> principalMap = new HashMap<>();

        Principal marek = new Principal("Marek", "Podstawowa");
        Principal grzegorz = new Principal("Grzegorz", "Średnia ");
        Principal janusz = new Principal("Janusz", "Liceum");
        Principal wojciech = new Principal("Wojciech", "Technikum");

        School marekSchool = new School(24,23,21);
        School grzegorzSchool = new School(35,15,25);
        School januszSchool = new School(56,32,24);
        School wojciechSchool = new School(47,21,25);

        principalMap.put( marekSchool, marek);
        principalMap.put( grzegorzSchool, grzegorz);
        principalMap.put( januszSchool, janusz);
        principalMap.put(wojciechSchool,wojciech);

        System.out.println(principalMap.get(marekSchool));



        for (Map.Entry<School, Principal> principalSchoolEntry : principalMap.entrySet())
            System.out.println(principalSchoolEntry.getKey()
                    + " jaki dyrektor " + principalSchoolEntry.getValue() +
                    " ilosc uczniów " + principalSchoolEntry.getKey().getAllStudents());

    }

}