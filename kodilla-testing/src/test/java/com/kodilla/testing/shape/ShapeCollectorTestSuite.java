package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Nested;
import shape.*;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test # " + testCounter);
    }

    @Nested
    @DisplayName("Tests for adding and removing")
    public class AddAndRemove {

        @Test
        void testAddingShape() {
            //Given
            ShapeCollector shape = new ShapeCollector();

            //When
            shape.addFigure(new Circle(2.5));

            //Then
            Assertions.assertEquals(1, shape.getShapes().size());
        }

        @Test
        void testRemovingFigure() {
            //Given
            ShapeCollector shape = new ShapeCollector();
            Triangle triangle = new Triangle(2.5, 4);
            shape.addFigure(triangle);

            //When
            shape.removeFigure(triangle);

            //Then
            Assertions.assertEquals(0, shape.getShapes().size());
        }
    }

    @Nested
    @DisplayName("Tests for displaying")
    public class Display {

        @Test
        void testGettingTheFigure() {
            //Given
            ShapeCollector shape = new ShapeCollector();
            Square square = new Square(3, 3);
            Triangle triangle = new Triangle(2, 3);

            //When
            shape.addFigure(square);
            shape.addFigure(square);
            shape.addFigure(triangle);

            //Then
            Assertions.assertEquals(triangle.getShapeName(), shape.getFigure(2));
        }
    }
}