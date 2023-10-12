package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    public static void main(String[] args) {

        PurchaseRequestRetriever purchase1 = new PurchaseRequestRetriever();
        PurchaseRequest purchaseRequest1 = purchase1.retrieveFirst();

        ShopProcessor shopProcessor1 = new ShopProcessor(new MailService(), new ShopPurchaseService(),
                                      new ShopPaymentProcessor(), new ShopPurchaseRepository());
        shopProcessor1.process(purchaseRequest1);

        System.out.println();
        System.out.println("========================================");
        System.out.println();

        PurchaseRequestRetriever purchase2 = new PurchaseRequestRetriever();
        PurchaseRequest purchaseRequest2 = purchase2.retrieveSecond();

        ShopProcessor shopProcessor2 = new ShopProcessor(new MailService(), new ShopPurchaseService(),
                new ShopPaymentProcessor(), new ShopPurchaseRepository());
        shopProcessor2.process(purchaseRequest2);

        System.out.println();
        System.out.println("========================================");
        System.out.println();

        PurchaseRequestRetriever purchase3 = new PurchaseRequestRetriever();
        PurchaseRequest purchaseRequest3 = purchase3.retrieveThird();

        ShopProcessor shopProcessor3 = new ShopProcessor(new MailService(), new ShopPurchaseService(),
                new ShopPaymentProcessor(), new ShopPurchaseRepository());
        shopProcessor3.process(purchaseRequest3);

    }
}
