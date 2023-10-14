package com.kodilla.good.patterns.challenges.food2door;

public interface PurchaseRepository {
    void createPurchase(Customer customer, Producer producer, Product product);
}
