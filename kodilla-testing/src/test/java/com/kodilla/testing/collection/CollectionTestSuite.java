package com.kodilla.testing.collection;

import com.kodilla.testing.user.SimpleUser;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DisplayName("Forum Test Suite")
public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName(
            "When created testCaseEmptyList with list with no records, " +
            "then emptyNumbersList should return true, as list is empty."
    )
    @Test
    void testOddNumbersExterminatorEmptyList () {
        // Given
        OddNumbersExterminator testCaseEmptyList = new OddNumbersExterminator();
        List<Integer> emptyList = new ArrayList<>();

        //When
        List<Integer> emptyNumbersList = testCaseEmptyList.exterminate(emptyList);
        System.out.println("Testing empty List");

        //Then
        Assertions.assertTrue(emptyList.isEmpty());
    }

    @DisplayName(
            "When created testCaseNormalList with normalList with records from 1 - 10, " +
            "then exterminate should eliminate any odd numbers and return only even numbers"
    )
    @Test
    void testOddNumbersExterminatorNormalList  () {
        // Given
        OddNumbersExterminator testCaseNormalList = new OddNumbersExterminator();
        List<Integer> normalList = new ArrayList<>();
        normalList.add(1);
        normalList.add(2);
        normalList.add(3);
        normalList.add(4);
        normalList.add(5);
        normalList.add(6);
        normalList.add(7);
        normalList.add(8);
        normalList.add(9);
        normalList.add(10);

        //When
        List<Integer> allNumbersList = testCaseNormalList.exterminate(normalList);
        System.out.println("Testing normal list");

        //Then
        Assertions.assertEquals(Arrays.asList(2, 4, 6, 8, 10), allNumbersList);
    }
}
