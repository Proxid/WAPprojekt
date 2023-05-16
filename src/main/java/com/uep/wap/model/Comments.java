package com.uep.wap.model;
import javax.persistence.*;
@Entity
@Table(name = "comments")
public class Comments {
    @Id
    @Column(name = "commentsID")
    private int commentsID;

    @Column(name = "usersID")
    private int usersID;

    @Column(name = "photoID")
    private int photoID;

    @Column(name = "content")
    private String content;

    @Column(name = "timeStamp")
    private String timeStamp;

    public void setCommentsID(int commentsID) {
        this.commentsID = commentsID;
    }

    public int getCommentsID() {
        return commentsID;
    }

    public void setUsersID(int usersID) {
        this.usersID = usersID;
    }

    public int getUsersID() {
        return usersID;
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