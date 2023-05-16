package com.uep.wap.model;
import javax.persistence.*;
@Entity
@Table(name = "user_gallery")
public class UserGallery {
    @Id
    @Column(name = "GalleryID")
    private int GalleryID;

    @Column(name = "userID")
    private int userID;

    @Column(name = "postID")
    private int postID;

    @Column(name = "photoDesc")
    private String photoDesc;

    @Column(name = "postingData")
    private String postingData;

    public void setGalleryID(int GalleryID) {
        this.GalleryID = GalleryID;
    }

    public int getGalleryID() {
        return GalleryID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getUserID() {
        return userID;
    }

    public void setPostID(int postID) {
        this.postID = postID;
    }

    public int getPostID() {
        return postID;
    }

    public void setPhotoDesc(String photoDesc) {
        this.photoDesc = photoDesc;
    }

    public String getPhotoDesc() {
        return photoDesc;
    }

    public void setPostingData(String postingData) {
        this.postingData = postingData;
    }

    public String getPostingData() {
        return postingData;
    }
}