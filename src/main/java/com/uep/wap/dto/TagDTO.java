package com.uep.wap.dto;

public class TagDTO {

    private int tagID;
    private String tagName;
    private String numberOfTaggedPosts;
    private String taggedPhotos;

    public int getTagID() {
        return tagID;
    }

    public void setTagId(int tagID) {
        this.tagID = tagID;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getNumberOfTaggedPosts() {
        return numberOfTaggedPosts;
    }

    public void setNumberOfTaggedPosts(String numberOfTaggedPosts) {
        this.numberOfTaggedPosts = numberOfTaggedPosts;
    }

    public String getTaggedPhotos() {
        return taggedPhotos;
    }

    public void setTaggedPhotos(String taggedPhotos) {
        this.taggedPhotos = taggedPhotos;
    }
    
}
