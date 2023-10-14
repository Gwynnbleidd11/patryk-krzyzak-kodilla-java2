package com.kodilla.good.patterns.challenges;

public class ShopPaymentProcessor implements PaymentService{
    @Override
    public void payment(Product product) {
        System.out.println("Price for " + product + " is " + product.getPrice() + " PLN");
    }
}
