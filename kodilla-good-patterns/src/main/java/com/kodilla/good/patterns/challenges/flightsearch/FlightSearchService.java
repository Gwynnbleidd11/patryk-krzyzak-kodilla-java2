package com.kodilla.good.patterns.challenges.flightsearch;

import java.util.Set;

public class FlightSearchService {
    public static void main(String[] args) {

        System.out.println(FlightSearchEngines.flightsFromAirport("Cracow"));
        System.out.println(FlightSearchEngines.flightsToAirport("Madrid"));
        System.out.println(FlightSearchEngines.flightsThroughAirport("Warsaw", "London"));

    }
}
