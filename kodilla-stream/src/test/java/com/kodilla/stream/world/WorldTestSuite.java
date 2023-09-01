package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        Country poland = new Country("Poland", new BigDecimal(37750000));
        Country germany = new Country("Germany", new BigDecimal(83200000));
        Country france = new Country("France", new BigDecimal(67750000));
        Country czech = new Country("Czech", new BigDecimal(10510000));
        Country unitedStatesOfAmerica = new Country("USA", new BigDecimal(331900000));
        Country canada = new Country("Canada", new BigDecimal(38250000));
        Country russia = new Country("Russia", new BigDecimal(143400000));
        Country china = new Country("China", new BigDecimal(1412000000));
        Country japan = new Country("Japan", new BigDecimal(125700000));

        Continent europe = new Continent("Europe");
        Continent northAmerica = new Continent("North America");
        Continent asia = new Continent("Asia");
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(france);
        europe.addCountry(czech);
        northAmerica.addCountry(unitedStatesOfAmerica);
        northAmerica.addCountry(canada);
        asia.addCountry(russia);
        asia.addCountry(china);
        asia.addCountry(japan);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(northAmerica);
        world.addContinent(asia);

        //When
        BigDecimal totalPeople = world.getPeopleQuantity();
        BigDecimal myCalculation = new BigDecimal("2250460000");

        //Then
        assertEquals(totalPeople, myCalculation);
    }
}
