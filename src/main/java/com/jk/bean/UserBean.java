package com.jk.bean;

import javax.persistence.*;
import java.util.Date;


public class UserBean {


    private Integer userId;


    private String userName;

    private String userPwd;


    private Integer userSex;


    private Date userBirthday;


    private Integer roleId;


    //业务字段


    private String rplename;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }


    @Override
    public String toString() {
        return "UserBean{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userSex=" + userSex +
                ", userBirthday=" + userBirthday +
                ", roleId=" + roleId +
                ", rplename='" + rplename + '\'' +
                '}';
    }
}
