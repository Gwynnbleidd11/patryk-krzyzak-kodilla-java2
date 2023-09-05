package com.kodilla.stream.portfolio;

public class ReverseString {

    private String string;

    public static StringBuilder reverseString(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.reverse();
        return stringBuilder;
    }

    public String getString() {
        return string;
    }
}
