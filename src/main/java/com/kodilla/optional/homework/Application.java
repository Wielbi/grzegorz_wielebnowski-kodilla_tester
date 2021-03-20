package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();



        Teacher teacherJan = new Teacher("Jan");

        Teacher teacherHubert = new Teacher("Hubert");
        Teacher teacherMarek = new Teacher("Marek");

        students.add(new Student("Piotr", null));
        students.add(new Student("Janek", teacherJan));
        students.add(new Student("Krzyś", teacherHubert));
        students.add(new Student("Olek", null));
        students.add(new Student("Krzysztof",teacherMarek));

        for (Student student: students ){
            Teacher teacher = student.getTeacher();

            String teacherName = Optional.ofNullable(teacher).orElse(new Teacher("<undefined>")).getName();

            System.out.println("Uczen : " + student.getName() + " nauczyciel " + teacherName);
        }



        }
    }




