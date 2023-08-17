package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.person.People;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        Forum forum = new Forum();
        Map<Integer, ForumUser> mapOfForumUsers = forum.getListOfForumUsers().stream()
                .filter(c -> c.getSex() == 'M')
                .filter(d -> d.getBirthDate().getYear() < 2003)
                .filter(c -> c.getNumberOfPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        System.out.println("# elements: " + mapOfForumUsers.size());
        mapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}