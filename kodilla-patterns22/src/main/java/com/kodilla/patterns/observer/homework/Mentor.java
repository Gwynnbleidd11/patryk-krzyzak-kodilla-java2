package com.kodilla.patterns.observer.homework;

public class Mentor implements Observer {

    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(Task task) {
        System.out.println(mentorName + ": New messages in topic " + task.getTasks() + "\n" +
                " (total: " + task.getTasks().size() + " messages)");
        updateCount++;
    }
}
