package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy: ");
        System.out.println("---------------------------------");
        System.out.println();

        Calculator calculator = new Calculator();

        int addition = calculator.addAToB(10, 5);
        if (addition == 15) {
            System.out.println("Addition test OK");
        } else {
            System.out.println("Error!");
        }

        int subtraction = calculator.subtractAFromB(10, 5);
        if (subtraction == 5) {
            System.out.println("Subtraction test OK");
        } else {
            System.out.println("Error!");
        }

    }
}
