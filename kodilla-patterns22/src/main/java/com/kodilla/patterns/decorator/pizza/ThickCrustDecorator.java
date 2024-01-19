package com.kodilla.patterns.decorator.pizza;

import java.math.BigDecimal;

public class ThickCrustDecorator extends AbstractPizzaOrderDecorator {

    public ThickCrustDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(10));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", thick crust";
    }
}
