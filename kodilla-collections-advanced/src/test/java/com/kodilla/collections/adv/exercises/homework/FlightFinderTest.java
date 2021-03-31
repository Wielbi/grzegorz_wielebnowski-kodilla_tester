package com.kodilla.collections.adv.exercises.homework;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {
    @Test
    public void testflightFlightsFrom() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> result = flightFinder.flightFlightsFrom("Lizbona");
        Assert.assertEquals(3, result.size());

    }

    @Test
    public void testflightFlightsTo() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> result = flightFinder.flightFlightsTo("Londyn");
        Assert.assertEquals(1, result.size());
    }

    @Test
    public void testflightFlightstTo() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> result = flightFinder.flightFlightsTo("Sydney");
        Assert.assertEquals(0, result.size());

    }

}







