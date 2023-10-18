package com.kodilla.good.patterns.challenges.flightsearch;

import java.time.LocalDate;

public final class Flight {

    private final String startingAirport;
    private final String destinationAirport;
    private final LocalDate dateOfFlight;

    public Flight(final String startingAirport, final String destinationAirport, final LocalDate dateOfFlight) {
        this.startingAirport = startingAirport;
        this.destinationAirport = destinationAirport;
        this.dateOfFlight = dateOfFlight;
    }

    public String getStartingAirport() {
        return startingAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public LocalDate getDateOfFlight() {
        return dateOfFlight;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "startingAirport='" + startingAirport + '\'' +
                ", destinationAirport='" + destinationAirport + '\'' +
                ", dateOfFlight=" + dateOfFlight +
                '}';
    }
}
