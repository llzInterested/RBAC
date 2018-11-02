package com.llz.bean;

public class User {
    private Integer id;
    private String uName;
    private Integer uPwd;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", uName='" + uName + '\'' +
                ", uPwd=" + uPwd +
                '}';
    }

    public User(Integer id, String uName, Integer uPwd) {
        this.id = id;
        this.uName = uName;
        this.uPwd = uPwd;
    }

    public User() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public Integer getuPwd() {
        return uPwd;
    }

    public void setuPwd(Integer uPwd) {
        this.uPwd = uPwd;
    }
}
