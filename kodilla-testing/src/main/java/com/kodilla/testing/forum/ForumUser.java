package com.kodilla.testing.forum;

import java.util.ArrayList;
import java.util.List;

public class ForumUser {

    private String name;
    private String realName;
    private List<ForumPost> posts = new ArrayList<>();
    private List<ForumComment> comments = new ArrayList<>();

    public ForumUser(String name, String realName) {
        this.name = name;
        this.realName = realName;
    }
}
