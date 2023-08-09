package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class OddNumbersExterminator {

    public List<Integer> listOfNumbers() {
        return listOfNumbers();
    }

    public List<Integer> exterminate(List<Integer> listOfNumbers) {
        List<Integer> evenNumbers = new ArrayList<>();

        for (Integer number : listOfNumbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }
}
