package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shopping = factory.createTask(TaskFactory.SHOPPING_TASK);

        //Then
        shopping.executeTask();
        assertEquals("Shopping Task", shopping.getTaskName());
        assertTrue(shopping.isTaskExecuted("Shopping Task"));
    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task painting = factory.createTask(TaskFactory.PAINTING_TASK);

        //Then
        painting.executeTask();
        assertEquals("Painting Task", painting.getTaskName());
        assertTrue(painting.isTaskExecuted("Painting Task"));
    }

    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task driving = factory.createTask(TaskFactory.DRIVING_TASK);

        //Then
        driving.executeTask();
        assertEquals("Driving Task", driving.getTaskName());
        assertTrue(driving.isTaskExecuted("Driving Task"));
    }
}
