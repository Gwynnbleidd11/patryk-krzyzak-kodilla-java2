package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User user1 = new Millenials("Adam Novak");
        User user2 = new YGeneration("Tom Smith");
        User user3 = new ZGeneration("Edgar Thompson");

        //When
        String user1ShouldUse = user1.sharePost();
        System.out.println("User 1 should post with: " + user1ShouldUse);
        String user2ShouldUse = user2.sharePost();
        System.out.println("User 2 should post with: " + user2ShouldUse);
        String user3ShouldUse = user3.sharePost();
        System.out.println("User 3 should post with: " + user3ShouldUse);

        //Then
        assertEquals("Facebook", user1ShouldUse);
        assertEquals("Twitter", user2ShouldUse);
        assertEquals("Snapchat", user3ShouldUse);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User user1 = new Millenials("Adam Novak");

        //When
        String user1ShouldUse = user1.sharePost();
        System.out.println("User 1 should post with: " + user1ShouldUse);
        user1.setSocialPublisher(new TwitterPublisher());
        user1ShouldUse = user1.sharePost();
        System.out.println("User 1 should post with: " + user1ShouldUse);

        //Then
        assertEquals("Twitter", user1ShouldUse);
    }
}
