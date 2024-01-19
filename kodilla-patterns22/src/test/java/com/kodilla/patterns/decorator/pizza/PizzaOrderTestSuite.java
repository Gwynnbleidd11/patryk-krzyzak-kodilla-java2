package com.kodilla.patterns.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    void testBasicPizzaOrderPrice() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();

        //When
        BigDecimal cost = thePizza.getCost();

        //Then
        assertEquals(new BigDecimal(15), cost);
    }

    @Test
    void testBasicPizzaOrderDescription() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();

        //When
        String desc = thePizza.getDescription();

        //Then
        assertEquals("Pizza, sauce, cheese", desc);
    }

    @Test
    void testBasicPizzaOrderPriceWithExtraToppings() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new HamDecorator(thePizza);
        thePizza = new MushroomsDecorator(thePizza);

        //When
        BigDecimal cost = thePizza.getCost();

        //Then
        assertEquals(new BigDecimal(30), cost);
    }

    @Test
    void testBasicPizzaOrderDescriptionWithExtraToppings() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new HamDecorator(thePizza);
        thePizza = new MushroomsDecorator(thePizza);

        //When
        String desc = thePizza.getDescription();

        //Then
        assertEquals("Pizza, sauce, cheese, ham, mushrooms", desc);
    }

    @Test
    void testBasicPizzaOrderPriceMaxOption() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new HamDecorator(thePizza);
        thePizza = new MushroomsDecorator(thePizza);
        thePizza = new ExtraCheeseDecorator(thePizza);
        thePizza = new ThickCrustDecorator(thePizza);
        thePizza = new OnionsDecorator(thePizza);
        thePizza = new SalameDecorator(thePizza);

        //When
        BigDecimal cost = thePizza.getCost();

        //Then
        assertEquals(new BigDecimal(60), cost);
    }
    @Test
    void testBasicPizzaOrderDescriptionMaxOption() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new HamDecorator(thePizza);
        thePizza = new MushroomsDecorator(thePizza);
        thePizza = new ExtraCheeseDecorator(thePizza);
        thePizza = new ThickCrustDecorator(thePizza);
        thePizza = new OnionsDecorator(thePizza);
        thePizza = new SalameDecorator(thePizza);

        //When
        String desc = thePizza.getDescription();

        //Then
        assertEquals("Pizza, sauce, cheese, ham, mushrooms, cheese, thick crust, onions, salame", desc);
    }
}
