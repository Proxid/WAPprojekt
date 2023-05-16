package com.uep.wap.model;
import javax.persistence.*;
@Entity
@Table(name = "posts")
public class Post {
    @Id
    @Column(name = "postID")
    private int postID;

    @Column(name = "userID")
    private int userID;

    @Column(name = "listOfTags")
    private String listOfTags;

    @Column(name = "listOfLiked")
    private String listOfLiked;

    @Column(name = "numberLikes")
    private int numberLikes;

    @Column(name = "postDate")
    private String postDate;

    @Column(name = "postDescr")
    private String postDescr;

    @Column(name = "postTags")
    private String postTags;

    @Column(name = "photoID")
    private int photoID;

    public void setPostID(int postID) {
        this.postID = postID;
    }

    public int getPostID() {
        return postID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getUserID() {
        return userID;
    }

    public void setListOfTags(String listOfTags) {
        this.listOfTags = listOfTags;
    }

    public String getListOfTags() {
        return listOfTags;
    }

    public void setListOfLiked(String listOfLiked) {
        this.listOfLiked = listOfLiked;
    }

    public String getListOfLiked() {
        return listOfLiked;
    }

    public void setNumberLikes(int numberLikes) {
        this.numberLikes = numberLikes;
    }

    public int getNumberLikes() {
        return numberLikes;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDescr(String postDescr) {
        this.postDescr = postDescr;
    }

    public String getPostDescr() {
        return postDescr;
    }

    public void setPostTags(String postTags) {
        this.postTags = postTags;
    }

    public String getPostTags() {
        return postTags;
    }

    public void setPhotoID(int photoID) {
        this.photoID = photoID;
    }

    public int getPhotoID() {
        return photoID;
    }

    public Post() {
    }
}
