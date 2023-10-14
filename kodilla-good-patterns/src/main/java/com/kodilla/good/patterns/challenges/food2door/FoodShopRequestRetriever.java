package com.kodilla.good.patterns.challenges.food2door;

public class FoodShopRequestRetriever {

    public FoodShopPurchaseRequest retrieveFirst() {
        Customer customer = new Customer("Adam", "Nowak", "xyz@wp.pl", "Cracow");
        Producer producer = new Producer("ExtraFoodShop", "ExtraFoodShop@gmail.com", "12 555-55-55", "Niepolomice", 0001);
        Product product = new Product("Carrot", 7.99, 10);

        return new FoodShopPurchaseRequest(customer, producer, product);
    }

    public FoodShopPurchaseRequest retrieveSecond() {
        Customer customer = new Customer("Jacek", "Kowalski", "jk@wp.pl", "Cracow");
        Producer producer = new Producer("HealthyShop", "HealthyShop@gmail.com", "12 428-37-16", "Wegrzce", 0002);
        Product product = new Product("Potatoes", 2.50, 16);

        return new FoodShopPurchaseRequest(customer, producer, product);
    }

    public FoodShopPurchaseRequest retrieveThird() {
        Customer customer = new Customer("Patryk", "Krzyzak", "patryk@wp.pl", "Cracow");
        Producer producer = new Producer("GlutenFreeShop", "GlutenFreeShop@gmail.com", "789-365-111", "Skawina", 0003);
        Product product = new Product("Chicken", 28.99, 5.5);

        return new FoodShopPurchaseRequest(customer, producer, product);
    }


}
