package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;
import java.util.List;

public class DrivingTask implements Task {

    private String taskName;
    private String where;
    private String using;
    private List<String> drivingTaskList = new ArrayList<>();

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        drivingTaskList.add(taskName);
    }

    public String getWhere() {
        return where;
    }

    public String getUsing() {
        return using;
    }

    @Override
    public void executeTask() {
        System.out.println("Executing Driving Task");
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted(String taskName) {
        for (String task : drivingTaskList) {
            if (task.equals(taskName))
                return true;
        }
        return false;
    }
}
