package com.kodilla.good.patterns.challenges.food2door;

public class FoodShopPurchaseRequest {

    private Customer customer;
    private Producer producer;
    private Product product;

    public FoodShopPurchaseRequest(Customer customer, Producer producer, Product product) {
        this.customer = customer;
        this.producer = producer;
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Producer getProducer() {
        return producer;
    }

    public Product getProduct() {
        return product;
    }
}
