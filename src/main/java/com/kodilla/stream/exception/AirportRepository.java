package com.kodilla.stream.exception;

import java.util.HashMap;
import java.util.Map;

public class AirportRepository {
    private static Map<String, Boolean> getListOfAirports(){
        Map<String,Boolean> airports = new HashMap<>();
        airports.put("Miami", true);
        airports.put("Malta", true);
        airports.put("LasPalmas", false);
        airports.put("Warsaw",true);
        return airports;


    }
    public static boolean isAirportInUse(String airport) throws AirportNotFoundException {
        if (getListOfAirports().containsKey(airport))
            return getListOfAirports().get(airport);
        throw new AirportNotFoundException();


    }
}
