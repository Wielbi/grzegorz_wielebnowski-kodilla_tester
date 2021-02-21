package com.kodilla.collections.adv.maps.homework;



import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> school = new HashMap<>();

        Principal marek = new Principal("Marek ", "Podstawowa");
        Principal grzegorz = new Principal("Grzegorz", "Średnia ");
        Principal janusz = new Principal("Janusz", "Liceum");
        Principal wojciech = new Principal("Wojciech","Technikum");

        School marekSchool = new School(24);
        School grzegorzSchool = new School(35);
        School januszSchool = new School(56);
        School wojciechSchool = new School(47);

        school.put(marek, marekSchool);
        school.put(grzegorz,grzegorzSchool);
        school.put(janusz,januszSchool);
        school.put(wojciech,wojciechSchool);

        System.out.println(school.get(marek));

       for (Map.Entry<Principal,School>principal : school.entrySet())
        System.out.println(principal.getKey().getFirstName()
                + " ilość  " + principal.getValue());
    }
}
