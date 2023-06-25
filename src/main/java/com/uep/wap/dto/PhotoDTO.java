package com.uep.wap.dto;

import java.util.ArrayList;
import java.util.List;

public class PhotoDTO {

    private int photoID;
    private String userID;
    private String photoUrl;
    private List<TagDTO> photoTags = new ArrayList<>();

    public int getPhotoID() {
        return photoID;
    }

    public void setPhotoID(int photoID) {
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

    public List<TagDTO> getPhotoTags() {
        return photoTags;
    }

    public void setPhotoTags(List<TagDTO> photoTags) {
        this.photoTags = photoTags;
    }
}
