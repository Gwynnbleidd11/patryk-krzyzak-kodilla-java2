package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    private List<String> randomUserListGenerator(int numberOfRecords) {
        List<String> listOfUsers = new ArrayList<>();
        for (int i = 1; i <= numberOfRecords; i++) {
            listOfUsers.add("User# " + i);
        }
        return listOfUsers;
    }

    @Test
    void testWhenNoPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        List<String> users = randomUserListGenerator(50);
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(0);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, forumStatistics.getAveragePostsPerUser());
    }

    @Test
    void testWhenManyPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        List<String> users = randomUserListGenerator(50);
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(1000);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(20, forumStatistics.getAveragePostsPerUser());
    }

    @Test
    void testWhenNoComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        List<String> users = randomUserListGenerator(20);
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(300);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, forumStatistics.getAverageCommentsPerPost());
        assertEquals(0, forumStatistics.getAverageCommentsPerUser());
    }

    @Test
    void testWhenCommentsAreLessThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(500);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0.5, forumStatistics.getAverageCommentsPerPost());
    }

    @Test
    void testWhenCommentsAreMoreThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(500);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(2, forumStatistics.getAverageCommentsPerPost());
    }

    @Test
    void testWhenThereAreNoUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        List<String> users = randomUserListGenerator(0);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(2500);
        when(statisticsMock.usersNames()).thenReturn(users);

        //When
        double postsPerUser = forumStatistics.getAveragePostsPerUser();
        double commentsPerUser = forumStatistics.getAverageCommentsPerUser();

        //Then
        assertEquals(0, postsPerUser);
        assertEquals(0, commentsPerUser);
    }

    @Test
    void testWhenThereAreUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        List<String> users = randomUserListGenerator(100);
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(2500);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(10, forumStatistics.getAveragePostsPerUser());
        assertEquals(25, forumStatistics.getAverageCommentsPerUser());
    }
}
