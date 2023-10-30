package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigMacTestSuite {

    @Test
    void testBigMac() {
        //Given
        BigMac bigMac = new BigMac.BurgerBuilder()
                .bun(Bun.SESAME_SEEDS)
                .burgers(2)
                .sauce(Sauce.STANDARD)
                .ingredient(Ingredients.LETTERS)
                .ingredient(Ingredients.PICKLES)
                .ingredient(Ingredients.CHEESE)
                .ingredient(Ingredients.ONION)
                .ingredient(Ingredients.BACON)
                .build();
        System.out.println(bigMac);

        //When
        int howManyBurgers = bigMac.getBurgers();
        int howManyIngredients = bigMac.getIngredients().size();

        //Then
        assertEquals(2, howManyBurgers);
        assertEquals(5, howManyIngredients);
    }
}
