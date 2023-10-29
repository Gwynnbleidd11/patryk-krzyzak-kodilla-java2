package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;
import java.util.List;

public class PaintingTask implements Task {

    private String taskName;
    private String color;
    private String whatToPaint;
    private List<String> paintingTaskList = new ArrayList<>();

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
        paintingTaskList.add(taskName);
    }

    public List<String> getPaintingTaskList() {
        return paintingTaskList;
    }

    public String getColor() {
        return color;
    }

    public String getWhatToPaint() {
        return whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println("Executing Painting Task");
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted(String taskName) {
        for (String task : paintingTaskList) {
            if (task.equals(taskName)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
