package com.kodilla.good.patterns.challenges;



public class ShopProcessor {

    private InformationService informationService;
    private PurchaseService purchaseService;
    private PaymentService paymentService;
    private PurchaseRepository purchaseRepository;

    public ShopProcessor(final InformationService informationService, final PurchaseService purchaseService,
                         final PaymentService paymentService, final PurchaseRepository purchaseRepository) {
        this.informationService = informationService;
        this.purchaseService = purchaseService;
        this.paymentService = paymentService;
        this.purchaseRepository = purchaseRepository;
    }

    public PurchaseDto process(final PurchaseRequest purchaseRequest) {
        boolean isAvailable = purchaseService.buy(purchaseRequest.getCustomer(), purchaseRequest.getItem());
        if (isAvailable) {
            informationService.inform(purchaseRequest.getCustomer(), purchaseRequest.getItem());
            paymentService.payment(purchaseRequest.getItem());
            purchaseRepository.createPurchase(purchaseRequest.getCustomer(), purchaseRequest.getItem());
            return new PurchaseDto(purchaseRequest.getCustomer(), true);
        } else {
            return new PurchaseDto(purchaseRequest.getCustomer(), false);
        }
    }
}
