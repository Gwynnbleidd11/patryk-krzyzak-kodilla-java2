package com.kodilla.good.patterns.challenges.food2door;

public class FoodShopProcessor {

    private InformationService informationService;
    private PurchaseService purchaseService;
    private PaymentService paymentService;
    private PurchaseRepository purchaseRepository;

    public FoodShopProcessor(final InformationService informationService, final PurchaseService purchaseService,
                         final PaymentService paymentService, final PurchaseRepository purchaseRepository) {
        this.informationService = informationService;
        this.purchaseService = purchaseService;
        this.paymentService = paymentService;
        this.purchaseRepository = purchaseRepository;
    }

    public PurchaseDto process(final FoodShopPurchaseRequest foodShopPurchaseRequest) {
        boolean isAvailable = purchaseService.buy(foodShopPurchaseRequest.getCustomer(), foodShopPurchaseRequest.getProducer(), foodShopPurchaseRequest.getProduct());
        if (isAvailable) {
            informationService.inform(foodShopPurchaseRequest.getCustomer(), foodShopPurchaseRequest.getProducer(), foodShopPurchaseRequest.getProduct());
            paymentService.payment(foodShopPurchaseRequest.getProducer(), foodShopPurchaseRequest.getProduct());
            purchaseRepository.createPurchase(foodShopPurchaseRequest.getCustomer(), foodShopPurchaseRequest.getProducer(), foodShopPurchaseRequest.getProduct());
            return new PurchaseDto(foodShopPurchaseRequest.getCustomer(), true);
        } else {
            return new PurchaseDto(foodShopPurchaseRequest.getCustomer(), false);
        }
    }
}
