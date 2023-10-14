package com.kodilla.good.patterns.challenges.food2door;

public class FoodShopPurchaseService implements PurchaseService {
    @Override
    public boolean buy(Customer customer, Producer producer, Product product) {
        System.out.println("Customer " + customer + " bought " + product.getDescription() + " from " + producer.getName() + " for " + product.getPrice() + " PLN");
        return true;
    }
}
