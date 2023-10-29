package com.remote.patterns.factory;

import com.remote.patterns.factory.delivery.Deliverer;

public class Application {
    public static void main(String[] args) {
        Order order = new Order("Iron 10 pieces", "CentralGrocery");
        Deliverer deliverer = DelivereFactory.create(order.getDelivererName());
        deliverer.processOrder(order);
    }
}
