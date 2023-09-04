package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length);
            OptionalDouble averageOfNumbers = IntStream.range(0, numbers.length)
                    .map(n -> numbers[n])
                    .average();

            return averageOfNumbers.getAsDouble();
    }

    static int getSum(int[] numbers) {
        int sumOfNumbers = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .sum();
        return sumOfNumbers;
    }
}