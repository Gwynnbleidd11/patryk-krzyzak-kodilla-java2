package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private Statistics statistics;
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();

        if (numberOfPosts > 0 && numberOfUsers > 0) {
            this.averagePostsPerUser = (double) numberOfPosts / numberOfUsers;
        } else {
            this.averagePostsPerUser = 0;
        }

        if (numberOfComments > 0 && numberOfUsers > 0) {
            this.averageCommentsPerUser = (double) numberOfComments / numberOfUsers;
        } else {
            this.averageCommentsPerUser = 0;
        }

        if (numberOfComments > 0 && numberOfPosts > 0) {
            this.averageCommentsPerPost = (double) numberOfComments / numberOfPosts;
        } else {
            this.averageCommentsPerPost = 0;
        }
    }

    public void showStatistics() {
        System.out.println("Number of users: " + this.numberOfUsers);
        System.out.println("Number of posts: " + this.numberOfPosts);
        System.out.println("Number of comments: " + this.numberOfComments);
        System.out.println("Average posts per user: " + this.averagePostsPerUser);
        System.out.println("Average comments per user: " + this.averageCommentsPerUser);
        System.out.println("Average comments per post: " + this.averageCommentsPerPost);
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }
}
