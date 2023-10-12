package com.kodilla.good.patterns.challenges;

public abstract class Product {

    double price;
    String description;

    public Product(double price, String description) {
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
