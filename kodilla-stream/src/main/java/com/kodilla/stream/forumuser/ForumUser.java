package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int userId;
    private final String username;
    private final char sex;
    private final LocalDate birthDate;
    private final int numberOfPosts;

    public ForumUser(int userId, String username, char sex, int yearOfBirth,
                     int monthOfBirth, int dayOfBirth, int numberOfPosts) {
        this.userId = userId;
        this.username = username;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.numberOfPosts = numberOfPosts;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
