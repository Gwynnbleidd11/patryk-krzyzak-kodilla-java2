package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            System.out.println(secondChallenge.probablyIWillThrowException(1, 3));
        } catch (Exception e) {
            System.out.println("Exception happened " + e);
        } finally {
            System.out.println("this is a tricky one");
        }

    }

}
