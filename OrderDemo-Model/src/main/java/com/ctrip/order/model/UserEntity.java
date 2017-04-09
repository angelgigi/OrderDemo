package com.ctrip.order.model;

/**
 * Created by angelqiqi on 2017/3/16.
 */
public class UserEntity {
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    private String name;
    private String userName;
    private String passWord;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }



}
