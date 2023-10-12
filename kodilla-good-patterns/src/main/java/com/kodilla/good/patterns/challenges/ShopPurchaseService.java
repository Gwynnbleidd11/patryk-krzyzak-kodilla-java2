package com.kodilla.good.patterns.challenges;

public class ShopPurchaseService implements PurchaseService {
    @Override
    public boolean buy(Customer customer, Product product) {
        System.out.println("Customer " + customer + " bought " + product + " for " + product.price + " PLN");
        return true;
    }
}
