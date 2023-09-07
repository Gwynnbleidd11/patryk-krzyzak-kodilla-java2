package com.kodilla.exception.test;

public class Exponentiation {

    public long exponentiation(int a, int b) throws ArithmeticException {
        long result = 1;
        try {
            if (a == 0 || b == 0) {
                throw new ArithmeticException();
            } else {
                while (b > 0) {
                    result = result * a;
                    b--;
                }
            }
        } catch (ArithmeticException e) {
            System.out.println("a or b are zero! Error: " + e);
        } finally {
            System.out.println("Calculation ended");
        }
        return result;
    }
}

