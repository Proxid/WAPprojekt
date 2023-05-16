package com.uep.wap.model;
import javax.persistence.*;
@Entity
@Table(name = "tags")
public class Tag {
    @Id
    @Column(name = "tagID")
    private int tagID;

    @Column(name = "tagName")
    private String tagName;

    @Column(name = "taggedPhotos")
    private String taggedPhotos;

    @Column(name = "numberOfTaggedPosts")
    private String numberOfTaggedPosts;

    public void setTagID(int tagID) {
        this.tagID = tagID;
    }

    public int getTagID() {
        return tagID;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTaggedPhotos(String taggedPhotos) {
        this.taggedPhotos = taggedPhotos;
    }

    public String getTaggedPhotos() {
        return taggedPhotos;
    }

    public void setNumberOfTaggedPosts(String numberOfTaggedPosts) {
        this.numberOfTaggedPosts = numberOfTaggedPosts;
    }

    public String getNumberOfTaggedPosts() {
        return numberOfTaggedPosts;
    }

    public Tag() {
    }
}