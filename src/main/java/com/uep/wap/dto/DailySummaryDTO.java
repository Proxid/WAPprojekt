package com.uep.wap.dto;

public class DailySummaryDTO {
    private int summaryID;
    private int countOfPosts;
    private int countOfComments;
    private int countOfEnthusiasts;
    private int countOfLikes;

    public void setSummaryID(int summaryID) {
        this.summaryID = summaryID;
    }

    public int getSummaryID() {
        return summaryID;
    }

    public void setCountOfPosts(int countOfPosts) {
        this.countOfPosts = countOfPosts;
    }

    public int getCountOfPosts() {
        return countOfPosts;
    }

    public void setCountOfComments(int countOfComments) {
        this.countOfComments = countOfComments;
    }

    public int getCountOfComments() {
        return countOfComments;
    }

    public void setCountOfEnthusiasts(int countOfEnthusiasts) {
        this.countOfEnthusiasts = countOfEnthusiasts;
    }

    public int getCountOfEnthusiasts() {
        return countOfEnthusiasts;
    }

    public void setCountOfLikes(int countOfLikes) {
        this.countOfLikes = countOfLikes;
    }

    public int getCountOfLikes() {
        return countOfLikes;
    }
}