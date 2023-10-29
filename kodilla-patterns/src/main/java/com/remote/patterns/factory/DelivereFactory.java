package com.remote.patterns.factory;

import com.remote.patterns.factory.delivery.CentralGrocery;
import com.remote.patterns.factory.delivery.CityStore;
import com.remote.patterns.factory.delivery.Deliverer;
import com.remote.patterns.factory.delivery.MegaStore;

public class DelivereFactory {
    public static Deliverer create(String delivererName) {
        return switch (delivererName) {
            case "MegaStore" -> new MegaStore();
            case "CityStore" -> new CityStore();
            case "CentralGrocery" -> new CentralGrocery();
            default -> null;
        };
    }
}
