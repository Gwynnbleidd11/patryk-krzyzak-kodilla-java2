package com.kodilla.patterns.decorator.pizza;

import java.math.BigDecimal;

public class OnionsDecorator extends AbstractPizzaOrderDecorator {

    public OnionsDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(7));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", onions";
    }
}
