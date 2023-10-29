package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING_TASK = "SHOPPING TASK";
    public static final String PAINTING_TASK = "PAINTING TASK";
    public static final String DRIVING_TASK = "DRIVING TASK";

    public Task createTask(final String taskType) {
        return switch (taskType) {
            case SHOPPING_TASK -> new ShoppingTask("Shopping Task", "buy potatoes", 2.0);
            case PAINTING_TASK -> new PaintingTask("Painting Task", "blue", "house");
            case DRIVING_TASK -> new DrivingTask("Driving Task", "home", "car");
            default -> null;
        };
    }
}
