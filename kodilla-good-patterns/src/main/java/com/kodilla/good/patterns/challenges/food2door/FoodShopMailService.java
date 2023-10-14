package com.kodilla.good.patterns.challenges.food2door;

public class FoodShopMailService implements InformationService {
    @Override
    public void inform(Customer customer, Producer producer, Product product) {
        System.out.println("Customer " + customer.getName() + " " + customer.getSurname() + ". You have purchased " + product.getDescription() +
                "from producer " + producer.getName() + " for " + (product.getPrice() * product.getWeight()) + " PLN");
    }
}
