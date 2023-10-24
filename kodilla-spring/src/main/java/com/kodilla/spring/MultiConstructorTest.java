package com.kodilla.spring;

import java.util.ArrayList;
import java.util.List;

public class MultiConstructorTest {

    private String word;
    private int number;

    public MultiConstructorTest(String word) {
        this.word = word;
    }

    public MultiConstructorTest(int number) {
        this.number = number;
    }

    public String getWord() {
        return word;
    }

    public int getNumber() {
        return number;
    }
}
