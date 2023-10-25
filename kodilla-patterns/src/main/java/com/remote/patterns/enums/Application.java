package com.remote.patterns.enums;

public class Application {
    public static void main(String[] args) {
        UserSelection userSelection = UserDialogs.getUserSelection();
        System.out.println(userSelection);
        if (userSelection == UserSelection.SCISSORS) {
            System.out.println("Your selection is scissors");
        } else if (userSelection == UserSelection.ROCK) {
            System.out.println("Your selection is rock");
        } else {
            System.out.println("Your selection is paper");
        }
    }
}
