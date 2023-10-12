package com.kodilla.good.patterns.challenges.solid;

import java.time.LocalDateTime;

public interface RentalRepository {
    void createRental(User user, LocalDateTime from, LocalDateTime to);
}
