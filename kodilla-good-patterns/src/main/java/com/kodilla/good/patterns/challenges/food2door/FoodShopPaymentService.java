package com.kodilla.good.patterns.challenges.food2door;

public class FoodShopPaymentService implements PaymentService {
    @Override
    public void payment(Producer producer, Product product) {
        System.out.println("Price for " + product.getDescription() + " is " + (product.getPrice() * product.getWeight()) + " PLN");
    }
}
