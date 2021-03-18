package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task>getTask(){
        List<Task> tasks = new ArrayList<>();

//        tasks.add(new Task("Jajka", LocalDate.of(2020,3,16), 2021));
//        tasks.add(new Task("Mleko ",LocalDate.now(), 2019));
//        tasks.add(new Task("Piwo",2009,2030));
//        tasks.add(new Task("Baton Mars",2021,2022));
        return tasks;

    }
}
