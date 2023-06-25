package com.uep.wap.dto;

public class UserGalleryDTO {

    private int GalleryID;
    private int userID;
    private int postID;
    private String photoDesc;
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
