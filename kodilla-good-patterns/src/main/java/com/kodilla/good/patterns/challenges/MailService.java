package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService{
    @Override
    public void inform(Customer customer, Product product) {
        System.out.println("Hello dear " + customer + ". You have bought " + product.description + " for " + product.price + " PLN");
    }


}
