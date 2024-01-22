package com.kodilla.patterns.observer.homework;

public interface Observable {
    void assignMentor(Observer observer);
    void notifyMentor();
    void unassignMentor(Observer observer);
}
