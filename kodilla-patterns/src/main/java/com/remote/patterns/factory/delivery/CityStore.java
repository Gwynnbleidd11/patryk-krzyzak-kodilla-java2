package com.remote.patterns.factory.delivery;

import com.remote.patterns.factory.Order;

public class CityStore implements Deliverer {
    @Override
    public void processOrder(Order order) {
        System.out.println("City Store: processing order " + order);
    }
}
