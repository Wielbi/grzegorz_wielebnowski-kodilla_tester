package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Student>students= new ArrayList<>();

        Student student = new Student("Pawel",null);
        Teacher teacher = new Teacher("Pan Hubert");
        student.getName();
        teacher.getName();

        }

    }

