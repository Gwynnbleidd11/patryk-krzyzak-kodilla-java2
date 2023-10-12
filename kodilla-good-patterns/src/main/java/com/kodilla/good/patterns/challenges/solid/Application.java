package com.kodilla.good.patterns.challenges.solid;

import java.time.LocalDateTime;

public class Application {

    public static void main(String[] args) {

        RentRequestRetriever rentRequestRetriever = new RentRequestRetriever();
        RentRequest rentRequest  = rentRequestRetriever.retrieve();

        RentalProcessor rentalProcessor = new RentalProcessor(new MailService(), new CarRentalService(), new CarRentalRepository());
        rentalProcessor.process(rentRequest);

        RentalProcessor segwayRentalProcessor = new RentalProcessor(new SegwayInformationService(), new SegwayRentalService(), new SegwayRentalRepository());
        segwayRentalProcessor.process(rentRequest);
    }
}
