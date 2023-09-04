package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import java.util.OptionalDouble;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage(){
        //Given
        int[] numbers = {2, 5, 12, 7, 9, 13, 3, 5, 1};

        //When
        double average = ArrayOperations.getAverage(numbers);
        double myAverage = 6.333333333333333;

        //Then
        assertEquals(myAverage, average);
    }

    @Test
    void testGetSum() {
        //Given
        int[] numbers = {2, 5, 12, 7, 9, 13, 3, 5, 1};

        //When
        int sum = ArrayOperations.getSum(numbers);
        int mySum = 57;

        //Then
        assertEquals(mySum, sum);
    }
}
