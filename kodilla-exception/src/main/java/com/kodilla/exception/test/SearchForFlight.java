package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchForFlight {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Warsaw", true);
        airports.put("Berlin", true);
        airports.put("Paris", true);
        airports.put("London", true);
        airports.put("Madrid", false);

        if (airports.containsKey(flight.getDepartureAirport()) && airports.containsKey(flight.getArrivalAirport())) {
            if (airports.get(flight.getDepartureAirport()) == true && airports.get(flight.getArrivalAirport()) == true) {
                System.out.println("Flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " exists!");
            } else {
                throw new RouteNotFoundException("This connection doesn't exists.");
            }
        } else {
            throw new RouteNotFoundException("This connection doesn't exists.");
        }
    }
}

