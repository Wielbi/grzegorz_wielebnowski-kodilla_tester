package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTask() {
        List<Task> tasks = new ArrayList<>();



        tasks.add(new Task("Umyc naczynia", LocalDate.of(2021, 03, 18),LocalDate.of(2021,03,19)));
        tasks.add(new Task("Kupic Mleko ", LocalDate.now(),LocalDate.now()));
        tasks.add(new Task("Naprawic Motor", LocalDate.of(2021,03,25),LocalDate.of(2021,04,22)));
        tasks.add(new Task("Wyjechac Na wakacje",LocalDate.of(2021,07,21),LocalDate.of(2021,8,10)));

        return tasks;

    }
}
