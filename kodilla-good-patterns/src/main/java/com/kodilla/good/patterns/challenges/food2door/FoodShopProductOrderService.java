package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.MailService;

public class FoodShopProductOrderService {
    public static void main(String[] args) {

        FoodShopRequestRetriever retriever = new FoodShopRequestRetriever();

        FoodShopPurchaseRequest request1 = retriever.retrieveFirst();
        FoodShopProcessor processor1 = new FoodShopProcessor(new FoodShopMailService(), new FoodShopPurchaseService(),
                                        new FoodShopPaymentService(), new FoodShopPurchaseRepository());
        processor1.process(request1);

        System.out.println();
        System.out.println("========================================");
        System.out.println();

        FoodShopPurchaseRequest request2 = retriever.retrieveSecond();
        FoodShopProcessor processor2 = new FoodShopProcessor(new FoodShopMailService(), new FoodShopPurchaseService(),
                new FoodShopPaymentService(), new FoodShopPurchaseRepository());
        processor2.process(request2);

        System.out.println();
        System.out.println("========================================");
        System.out.println();

        FoodShopPurchaseRequest request3 = retriever.retrieveSecond();
        FoodShopProcessor processor3 = new FoodShopProcessor(new FoodShopMailService(), new FoodShopPurchaseService(),
                new FoodShopPaymentService(), new FoodShopPurchaseRepository());
        processor3.process(request3);
    }
}
