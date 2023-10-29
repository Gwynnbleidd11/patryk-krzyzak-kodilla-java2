package com.remote.patterns.factory.delivery;

import com.remote.patterns.factory.Order;

public class CentralGrocery implements Deliverer {
    @Override
    public void processOrder(Order order) {
        System.out.println("Central Grocery: processing order" + order);
    }
}
