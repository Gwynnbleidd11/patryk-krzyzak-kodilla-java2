package com.kodilla.exception.test;

public class CheckForFlight {

    public static void main(String[] args) {

        Flight flight1 = new Flight("Warsaw", "Berlin");
        Flight flight2 = new Flight("Berlin", "Warsaw");
        Flight flight3 = new Flight("Warsaw", "Paris");
        Flight flight4 = new Flight("Paris", "Madrid");
        Flight flight5 = new Flight("London", "Cracow");
        Flight flight6 = new Flight("Madrid", "London");

        SearchForFlight searchForFlight = new SearchForFlight();

        try {
            searchForFlight.findFlight(flight4);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }
    }
}
