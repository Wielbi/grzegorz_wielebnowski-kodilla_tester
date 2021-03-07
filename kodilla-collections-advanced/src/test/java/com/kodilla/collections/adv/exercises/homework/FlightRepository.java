package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightRepository {

    Map<String, List<Flight>> flightRepository = new HashMap<>();

    public void addFlight(String Flight, String departure) {
        List<Flight> flights = flightRepository.getOrDefault(addFlight(), new ArrayList<>());


    }

    private Object addFlight() {

        return null;
    }
}
