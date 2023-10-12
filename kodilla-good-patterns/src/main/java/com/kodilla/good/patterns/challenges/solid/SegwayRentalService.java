package com.kodilla.good.patterns.challenges.solid;

import java.time.LocalDateTime;

public class SegwayRentalService implements RentalService {
    @Override
    public boolean rent(final User user, final LocalDateTime carRentFrom, final LocalDateTime carRentTo) {
        System.out.println("Renting segway for: " + user.getName() + " " + user.getSurname()
                + " from: " + carRentFrom.toString() + " to: " + carRentTo.toString());

        return true;
    }
}
