package com.dudu.domain;

/**
 * Created by tengj on 2017/3/29.
 */
public class User {
    private String userName;
    private String passWord;
    private Integer id;

    public User(String userName, String passWord, Integer id) {
        this.userName = userName;
        this.passWord = passWord;
        this.id = id;
    }

    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", id=" + id +
                '}';
    }
}
