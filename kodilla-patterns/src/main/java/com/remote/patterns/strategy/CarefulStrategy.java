package com.remote.patterns.strategy;

public class CarefulStrategy implements InvestmentStrategy {
    @Override
    public void invest() {
        System.out.println("Buying obligations");
    }
}
