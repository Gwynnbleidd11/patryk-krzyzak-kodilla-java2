package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;
import java.util.List;

public class ShoppingTask implements Task {

    private String taskName;
    private String whatToBuy;
    private double quantity;
    private List<String> shoppingTasksList = new ArrayList<>();

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
        shoppingTasksList.add(taskName);
    }

    public List<String> getShoppingTasksList() {
        return shoppingTasksList;
    }

    public String getWhatToBuy() {
        return whatToBuy;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public void executeTask() {
        System.out.println("Executing Shopping Task");
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted(String taskName) {
        for (String task : shoppingTasksList) {
            if (task.equals(taskName)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
