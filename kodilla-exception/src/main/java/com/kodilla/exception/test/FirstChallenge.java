package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
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

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result = firstChallenge.divide(3, 0);

        System.out.println(result);

    }
}
