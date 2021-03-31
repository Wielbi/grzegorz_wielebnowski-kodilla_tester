package com.kodilla.stream.exception;


import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AirportRepositoryTestSuite {
    @Test
    public void testIsAirportInUse() throws AirportNotFoundException{
        //given
        AirportRepository airportRepository = new AirportRepository();
        //when
        boolean inWarsawInUse = airportRepository.isAirportInUse("Warsaw");
        //then
        assertTrue(inWarsawInUse);
    }
    @Test( expected =  AirportNotFoundException.class)
    public void testIsAirportInUse_withException() throws AirportNotFoundException {
        // given
        AirportRepository airportRepository = new AirportRepository();
        // when
        boolean isWarsawInUse = airportRepository.isAirportInUse("Vienna");
        // then
        assertFalse(isWarsawInUse);
    }
}