package com.remote.patterns.enums;

import java.util.Scanner;

public class UserDialogs {

    public static UserSelection getUserSelection() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your choice (S)cissors, (R)ock, (P)aper: ");
            String s = scan.nextLine().toUpperCase();
            switch (s) {
                case "S":
                    return UserSelection.SCISSORS;
                case "P":
                    return UserSelection.PAPER;
                case "R":
                    return UserSelection.ROCK;
                default:
                    System.out.println("Your selection is wrong, try again");
            }
        }
    }
}
