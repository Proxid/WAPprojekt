package com.uep.wap.dto;

import java.util.ArrayList;
import com.uep.wap.model.Tag;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.List;

public class PhotoDTO {

    private int photoID;
    private String userID;
    private String photoUrl;
    // private String photoTags;

    // @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    // @JoinTable(name = "photo_tags", joinColumns = @JoinColumn(name = "photo_id"), inverseJoinColumns = @JoinColumn(name = "tag_id"))
    private List<Tag> photoTags = new ArrayList<>();

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

    public List<Tag> getPhotoTags() {
        return photoTags;
    }

    public void setPhotoTags(List<Tag> photoTags) {
        this.photoTags = photoTags;
    }
}
