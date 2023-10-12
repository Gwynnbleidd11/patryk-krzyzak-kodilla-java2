package com.kodilla.good.patterns.challenges;

public class PurchaseRequest {

    private Customer customer;
    private Product item;

    public PurchaseRequest(Customer customer, Product item) {
        this.customer = customer;
        this.item = item;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getItem() {
        return item;
    }
}
