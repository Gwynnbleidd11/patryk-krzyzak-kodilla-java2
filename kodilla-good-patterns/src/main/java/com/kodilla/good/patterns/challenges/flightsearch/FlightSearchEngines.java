package com.kodilla.good.patterns.challenges.flightsearch;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightSearchEngines {

    public static Set<Flight> flightsFromAirport(String airport) {
        Set<Flight> flightSet = FlightsDatabase.getSetOfFlights().stream()
                .filter(a -> a.getStartingAirport().equals(airport))
                .collect(Collectors.toSet());
        return flightSet;
    }

    public static List<Flight> flightsToAirport (String airport) {
        List<Flight> flightList = FlightsDatabase.getSetOfFlights().stream()
                .filter(a -> a.getDestinationAirport().equals(airport))
                .collect(Collectors.toList());
        return flightList;
    }

    public static List<Flight> flightsThroughAirport (String airportA, String airportB) {
        List<Flight> flightList = FlightsDatabase.getSetOfFlights().stream()
                .filter(a -> a.getDestinationAirport().equals(airportA) || a.getStartingAirport().equals(airportA))
                .collect(Collectors.toList());
        return flightList;
    }
}
