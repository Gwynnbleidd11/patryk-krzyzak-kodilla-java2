package com.remote.patterns.factory.delivery;

import com.remote.patterns.factory.Order;

public interface Deliverer {

    void processOrder(Order order);
}
