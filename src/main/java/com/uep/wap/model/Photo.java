package com.uep.wap.model;
import javax.persistence.*;
@Entity
@Table(name = "photos")
public class Photo {
    @Id
    @Column(name = "photoID")
    private int photoID;

    @Column(name = "userID")
    private int userID;

    @Column(name = "photoTags")
    private String photoTags;

    public void setPhotoID(int photoID) {
        this.photoID = photoID;
    }

    public int getPhotoID() {
        return photoID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getUserID() {
        return userID;
    }

    public void setPhotoTags(String photoTags) {
        this.photoTags = photoTags;
    }

    public String getPhotoTags() {
        return photoTags;
    }

    public Photo() {
    }
}