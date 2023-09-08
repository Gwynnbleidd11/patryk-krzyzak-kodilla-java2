package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide1(double a, double b) throws ArithmeticException {
        double c = 0;
        try {
            if (b != 0) {
                c = a / b;
            } else {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0! Error: " + e);
        } finally {
            System.out.println("Done");
        }
        return c;
    }

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("się wywalilo");
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();
        System.out.println();

        try {
            double result = firstChallenge.divide(3, 0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error " + e);
        } finally {
            System.out.println("Finally!");
        }

        System.out.println();
        System.out.println("-----------------------------");
        System.out.println();
        System.out.println("Zadanie dodatkowe");
        System.out.println();

        Exponentiation exponentiation = new Exponentiation();

        try {
            long result = exponentiation.exponentiation(0, 2);
        } catch (ArithmeticException e) {
            System.out.println("Error " + e);
        }
    }
}
