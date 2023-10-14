package com.kodilla.good.patterns.challenges.food2door;

public class Product {

    private String description;
    private double price;
    private double weight;

    public Product(String description, double price, double weight) {
        this.description = description;
        this.price = price;
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }
}
