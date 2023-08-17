package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> listOfForumUsers = new ArrayList<>();

    public Forum() {
        listOfForumUsers.add(new ForumUser(1, "mythrandir", 'M', 1982, 07, 15, 1));
        listOfForumUsers.add(new ForumUser(2, "zuuk", 'M', 1995, 07, 15, 23));
        listOfForumUsers.add(new ForumUser(3, "weno", 'M', 1986, 07, 15, 0));
        listOfForumUsers.add(new ForumUser(4, "kassandra", 'K', 2015, 07, 15, 12));
        listOfForumUsers.add(new ForumUser(5, "jareck", 'M', 2008, 07, 15, 67));
        listOfForumUsers.add(new ForumUser(6, "max", 'M', 2009, 07, 15, 2));
        listOfForumUsers.add(new ForumUser(7, "sparrhawk", 'M', 1996, 07, 15, 0));
        listOfForumUsers.add(new ForumUser(8, "varka", 'K', 1996, 07, 15, 22));
        listOfForumUsers.add(new ForumUser(9, "jaden", 'K', 2011, 07, 15, 2));
        listOfForumUsers.add(new ForumUser(10, "applejuice", 'K', 1965, 07, 15, 10));
    }

    public List<ForumUser> getListOfForumUsers() {
        return new ArrayList<>(listOfForumUsers);
    }
}
