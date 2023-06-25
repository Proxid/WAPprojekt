package com.uep.wap.model;
import javax.persistence.*;
@Entity
@Table(name = "comment")
public class Comment {
    @Id
    @Column(name = "commentID")
    private int commentID;

    @Column(name = "userID")
    private int userID;

    @Column(name = "photoID")
    private int photoID;

    @Column(name = "content")
    private String content;

    @Column(name = "timeStamp")
    private String timeStamp;

    public void setCommentsID(int commentID) {
        this.commentID = commentID;
    }

    public int getCommentID() {
        return commentID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getUserID() {
        return userID;
    }

    public void setPhotoID(int photoID) {
        this.photoID = photoID;
    }

    public int getPhotoID() {
        return photoID;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getTimeStamp() {
        return timeStamp;
    }
}