package com.uep.wap.dto;

public class PostDTO {

    private int postID;
    private int userID;
    private String listOfTags;
    private String listOfLiked;
    private int numberLikes;
    private String postDate;
    private String postDescr;
    private String postTags;
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

}
