package com.uep.wap.model;
import javax.persistence.*;
@Entity
@Table(name = "daily_summary")
public class DailySummary {
    @Id
    @Column(name = "summaryID")
    private int summaryID;

    @Column(name = "countOfPosts")
    private int countOfPosts;

    @Column(name = "countOfComments")
    private int countOfComments;

    @Column(name = "countOfEnthusiasts")
    private int countOfEnthusiasts;

    @Column(name = "countOfLikes")
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
