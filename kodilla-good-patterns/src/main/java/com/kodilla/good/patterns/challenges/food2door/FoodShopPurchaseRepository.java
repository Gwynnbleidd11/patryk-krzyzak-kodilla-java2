package com.kodilla.good.patterns.challenges.food2door;

public class FoodShopPurchaseRepository implements PurchaseRepository {
    @Override
    public void createPurchase(Customer customer, Producer producer, Product product) {
        System.out.println("Adding to database");
    }
}
