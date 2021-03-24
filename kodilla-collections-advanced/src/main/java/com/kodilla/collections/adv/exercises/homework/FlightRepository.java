package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightRepository {


    public static List<Flight> getFlightsTable() {

        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Lizbona","Warszawa"));
        flights.add(new Flight("Moskwa","Londyn"));
        flights.add(new Flight("Praga","Katowice"));
        flights.add(new Flight("Lizbona","Madryt"));
        flights.add(new Flight("Lizbona","Dubaj"));
        return flights;



    }
}
