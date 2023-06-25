package com.uep.wap.dto;

public class PhotoDTO {

    private int photoID;
    private String userID;
    private String photoUrl;
    private String photoTags;

    public int getPhotoID() {
        return photoID;
    }

    public void setPhotoId(int photoID) {
        this.photoID = photoID;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPhotoTags() {
        return photoTags;
    }

    public void setPhotoTags(String photoTags) {
        this.photoTags = photoTags;
    }
    
}
