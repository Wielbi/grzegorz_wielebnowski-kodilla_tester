package com.kodilla.stream.exception;

public class ThirdExample {
    public static void main(String[] args) {
        AirportRepository airportRepository = new AirportRepository();
        try {
        boolean isVienaaInUse = airportRepository.isAirportInUse("Vienna");
        System.out.println("Vienna Status: " + isVienaaInUse);

            isVienaaInUse = AirportRepository.isAirportInUse("Vienna");
        } catch (AirportNotFoundException e) {
            System.out.println("Sorry, this Airport cannon be served by our airlines. ");
        }finally {
            System.out.println(" Thank you for using Kodilla AirLines");

        }


    }
}
