package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    @Test
    void testLastLog() {
        //Given
        Logger logger = Logger.LOG;
        logger.log("Hello there");

        //When
        String log = logger.getLastLog();

        //Then
        assertEquals("Hello there", log);
    }
}
