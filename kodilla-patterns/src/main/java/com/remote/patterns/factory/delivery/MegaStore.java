package com.remote.patterns.factory.delivery;

import com.remote.patterns.factory.Order;

public class MegaStore implements Deliverer {
    @Override
    public void processOrder(Order order) {
        System.out.println("Mega Store: processing order " + order);
    }
}
