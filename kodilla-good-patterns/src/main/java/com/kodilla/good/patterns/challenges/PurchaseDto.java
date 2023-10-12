package com.kodilla.good.patterns.challenges;

public class PurchaseDto {

    private Customer customer;
    private boolean isAvailable;

    public PurchaseDto(Customer customer, boolean isAvailable) {
        this.customer = customer;
        this.isAvailable = isAvailable;
    }

    public Customer getCustomer() {
        return customer;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
