package com.uep.wap.model;
import javax.persistence.*;
@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "userID")
    private int userID;

    @Column(name = "userName")
    private String userName;

    @Column(name = "userPassword")
    private String userPassword;

    @Column(name = "userEmail")
    private String userEmail;

    @Column(name = "userPosts")
    private String userPosts;

    @Column(name = "userEnthusiast")
    private String userEnthusiast;

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserPosts(String userPosts) {
        this.userPosts = userPosts;
    }

    public String getUserPosts() {
        return userPosts;
    }

    public void setUserEnthusiast(String userEnthusiast) {
        this.userEnthusiast = userEnthusiast;
    }

    public String getUserEnthusiast() {
        return userEnthusiast;
    }

    public User() {
    }
}