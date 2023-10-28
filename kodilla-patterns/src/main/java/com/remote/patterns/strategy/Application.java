package com.remote.patterns.strategy;

public class Application {
    public static void main(String[] args) {
        Customer c1 = new Customer("John Novak", new AggressiveStrategy());
        Customer c2 = new Customer("John Swift", new CarefulStrategy());
        InvestmentEngine investmentEngine = new InvestmentEngine();
        investmentEngine.invest(c1);
        investmentEngine.invest(c2);

        c1.setInvestmentStrategy(new CarefulStrategy());
        investmentEngine.invest(c1);

    }
}
