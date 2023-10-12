package com.kodilla.good.patterns.challenges;

public class PurchaseRequestRetriever {

    public PurchaseRequest retrieveFirst() {
        Customer customer = new Customer("Adam", "Nowak", "anowak@wp.pl", "Warsaw");
        ProductSocks socks = new ProductSocks(5.99, "Socks");

        return new PurchaseRequest(customer, socks);
    }

    public PurchaseRequest retrieveSecond() {
        Customer customer = new Customer("Jacek", "Kowalski", "kjacek@wp.pl", "Cracow");
        ProductTv tv = new ProductTv(12999, "Samsung TV");

        return new PurchaseRequest(customer, tv);
    }

    public PurchaseRequest retrieveThird() {
        Customer customer = new Customer("Krzysztof", "Podolski", "podol198@wp.pl", "Warsaw");
        ProductPot pot = new ProductPot(15.99, "Pot");

        return new PurchaseRequest(customer, pot);
    }
}
