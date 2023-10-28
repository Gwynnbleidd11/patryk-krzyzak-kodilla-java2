package com.remote.patterns.strategy;

public class AggressiveStrategy implements InvestmentStrategy {
    @Override
    public void invest() {
        System.out.println("Buying shares");
    }
}
