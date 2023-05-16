package com.uep.wap.model;
import javax.persistence.*;
@Entity
@Table(name = "likes")
public class Like {
    @Id
    @Column(name = "likeID")
    private int likeID;

    @Column(name = "userID")
    private int userID;

    @Column(name = "photoID")
    private int photoID;

    @Column(name = "userIDLike")
    private int userIDLike;

    @Column(name = "usernameLike")
    private String usernameLike;

    @Column(name = "targetID")
    private int targetID;

    @Column(name = "timeStamp")
    private String timeStamp;

    public void setLikeID(int likeID) {
        this.likeID = likeID;
    }

    public int getLikeID() {
        return likeID;
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

    public void setUserIDLike(int userIDLike) {
        this.userIDLike = userIDLike;
    }

    public int getUserIDLike() {
        return userIDLike;
    }

    public void setUsernameLike(String usernameLike) {
        this.usernameLike = usernameLike;
    }

    public String getUsernameLike() {
        return usernameLike;
    }

    public void setTargetID(int targetID) {
        this.targetID = targetID;
    }

    public int getTargetID() {
        return targetID;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getTimeStamp() {
        return timeStamp;
    }
}
