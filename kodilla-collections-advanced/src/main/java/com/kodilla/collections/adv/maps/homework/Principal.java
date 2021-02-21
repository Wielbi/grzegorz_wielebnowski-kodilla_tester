package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {

    private String firstName;
    private String nameschool;


    public Principal(String firstName,String nameschool){
        this.firstName = firstName;
        this.nameschool = nameschool;

    }
    public String getFirstName(){
        return firstName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return Objects.equals(firstName, principal.firstName) &&
                Objects.equals(nameschool, principal.nameschool);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, nameschool);
    }

    @Override
    public String toString() {
        return "Principal{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + nameschool + '\'' +
                '}';
    }

    public String getNameschool(){
        return nameschool;


    }

}
