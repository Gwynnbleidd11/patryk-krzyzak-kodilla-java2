package com.kodilla.patterns.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Task implements Observable {

    private final List<Observer> observers;
    private final List<String> tasks;
    private final String name;

    public Task(String name) {
        this.observers = new ArrayList<>();
        this.tasks = new ArrayList<>();
        this.name = name;
    }

    public void addTask(String taskName) {
        tasks.add(taskName);
        notifyMentor();
    }

    @Override
    public void assignMentor(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyMentor() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void unassignMentor(Observer observer) {
        observers.remove(observer);
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }
}
