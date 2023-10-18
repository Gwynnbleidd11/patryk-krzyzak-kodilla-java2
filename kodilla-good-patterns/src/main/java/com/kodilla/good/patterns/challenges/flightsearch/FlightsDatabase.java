package com.kodilla.good.patterns.challenges.flightsearch;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public final class FlightsDatabase {

    public static Set<Flight> getSetOfFlights() {
        final Set<Flight> setOfFlights = new HashSet<>();
        setOfFlights.add(new Flight("Cracow", "Warsaw", LocalDate.of(2023, 11, 1)));
        setOfFlights.add(new Flight("Cracow", "Warsaw", LocalDate.of(2023, 11, 3)));
        setOfFlights.add(new Flight("Cracow", "Warsaw", LocalDate.of(2023, 11, 5)));
        setOfFlights.add(new Flight("Cracow", "Warsaw", LocalDate.of(2023, 11, 7)));
        setOfFlights.add(new Flight("Cracow", "Warsaw", LocalDate.of(2023, 11, 9)));
        setOfFlights.add(new Flight("Cracow", "Warsaw", LocalDate.of(2023, 11, 11)));
        setOfFlights.add(new Flight("Cracow", "Warsaw", LocalDate.of(2023, 11, 13)));
        setOfFlights.add(new Flight("Cracow", "Warsaw", LocalDate.of(2023, 11, 15)));
        setOfFlights.add(new Flight("Cracow", "Warsaw", LocalDate.of(2023, 11, 17)));
        setOfFlights.add(new Flight("Cracow", "Warsaw", LocalDate.of(2023, 11, 19)));
        setOfFlights.add(new Flight("Warsaw", "London", LocalDate.of(2023, 11, 2)));
        setOfFlights.add(new Flight("Warsaw", "London", LocalDate.of(2023, 11, 4)));
        setOfFlights.add(new Flight("Warsaw", "London", LocalDate.of(2023, 11, 6)));
        setOfFlights.add(new Flight("Warsaw", "London", LocalDate.of(2023, 11, 8)));
        setOfFlights.add(new Flight("Warsaw", "London", LocalDate.of(2023, 11, 10)));
        setOfFlights.add(new Flight("Warsaw", "London", LocalDate.of(2023, 11, 12)));
        setOfFlights.add(new Flight("Warsaw", "London", LocalDate.of(2023, 11, 14)));
        setOfFlights.add(new Flight("Warsaw", "London", LocalDate.of(2023, 11, 16)));
        setOfFlights.add(new Flight("Warsaw", "London", LocalDate.of(2023, 11, 18)));
        setOfFlights.add(new Flight("Warsaw", "London", LocalDate.of(2023, 11, 20)));
        setOfFlights.add(new Flight("London", "Paris", LocalDate.of(2023, 11, 1)));
        setOfFlights.add(new Flight("London", "Paris", LocalDate.of(2023, 11, 5)));
        setOfFlights.add(new Flight("London", "Paris", LocalDate.of(2023, 11, 10)));
        setOfFlights.add(new Flight("London", "Paris", LocalDate.of(2023, 11, 15)));
        setOfFlights.add(new Flight("London", "Paris", LocalDate.of(2023, 11, 20)));
        setOfFlights.add(new Flight("London", "Paris", LocalDate.of(2023, 11, 25)));
        setOfFlights.add(new Flight("Paris", "Berlin", LocalDate.of(2023, 11, 3)));
        setOfFlights.add(new Flight("Paris", "Berlin", LocalDate.of(2023, 11, 6)));
        setOfFlights.add(new Flight("Paris", "Berlin", LocalDate.of(2023, 11, 9)));
        setOfFlights.add(new Flight("Paris", "Berlin", LocalDate.of(2023, 11, 12)));
        setOfFlights.add(new Flight("Paris", "Berlin", LocalDate.of(2023, 11, 15)));
        setOfFlights.add(new Flight("Paris", "Berlin", LocalDate.of(2023, 11, 18)));
        setOfFlights.add(new Flight("Berlin", "Cracow", LocalDate.of(2023, 11, 2)));
        setOfFlights.add(new Flight("Berlin", "Cracow", LocalDate.of(2023, 11, 5)));
        setOfFlights.add(new Flight("Berlin", "Cracow", LocalDate.of(2023, 11, 7)));
        setOfFlights.add(new Flight("Berlin", "Cracow", LocalDate.of(2023, 11, 13)));
        setOfFlights.add(new Flight("Berlin", "Cracow", LocalDate.of(2023, 11, 19)));
        setOfFlights.add(new Flight("Berlin", "Cracow", LocalDate.of(2023, 11, 25)));
        setOfFlights.add(new Flight("Berlin", "Madrid", LocalDate.of(2023, 11, 5)));
        setOfFlights.add(new Flight("Berlin", "Madrid", LocalDate.of(2023, 11, 8)));
        setOfFlights.add(new Flight("Berlin", "Madrid", LocalDate.of(2023, 11, 14)));
        setOfFlights.add(new Flight("Berlin", "Madrid", LocalDate.of(2023, 11, 19)));

        return new HashSet<>(setOfFlights);
    }
}
