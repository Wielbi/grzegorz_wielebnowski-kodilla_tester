package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School {
    private List<Double> school = new ArrayList<>();

    public School(double... school) {
        for (double clas : school)
            this.school.add(clas);
    }


    @Override
    public String toString() {
        return "School" + school.toString();

    }
}





