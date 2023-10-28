package com.remote.patterns.strategy;

public class Customer {
    private String name;
    private InvestmentStrategy investmentStrategy;

    public Customer(String name, InvestmentStrategy investmentStrategy) {
        this.name = name;
        this.investmentStrategy = investmentStrategy;
    }

    public void invest() {
        investmentStrategy.invest();
    }

    public void setInvestmentStrategy(InvestmentStrategy investementStrategy) {
        this.investmentStrategy = investementStrategy;
    }
}
