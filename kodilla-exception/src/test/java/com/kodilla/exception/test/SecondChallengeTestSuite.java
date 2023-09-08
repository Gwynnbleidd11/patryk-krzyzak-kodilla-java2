package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.testng.Assert.assertThrows;

public class SecondChallengeTestSuite {



    @Test
    void testIfAllDataIsGood() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertAll(
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 3)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 1.4)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.99, 1.49)),
                () -> assertThrows(() -> secondChallenge.probablyIWillThrowException(1.9, 1.5)),
                () -> assertThrows(() -> secondChallenge.probablyIWillThrowException(8, 10)),
                () -> assertThrows(() -> secondChallenge.probablyIWillThrowException(2.1, 1.6))
        );
    }
}
