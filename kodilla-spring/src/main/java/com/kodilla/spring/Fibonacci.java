package com.kodilla.spring;

public class Fibonacci {

    public static int calculateFibonacci(int n) {
        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static int recursionFibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return recursionFibonacci(n - 1) + recursionFibonacci(n - 2);
    }
}
