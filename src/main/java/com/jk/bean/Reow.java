package com.jk.bean;

public class Reow {

    private Integer reowId;

    private String rewoName;

    private Integer reowUser;

    public Integer getReowId() {
        return reowId;
    }

    public void setReowId(Integer reowId) {
        this.reowId = reowId;
    }

    public String getRewoName() {
        return rewoName;
    }

    public void setRewoName(String rewoName) {
        this.rewoName = rewoName;
    }

    public Integer getReowUser() {
        return reowUser;
    }

    public void setReowUser(Integer reowUser) {
        this.reowUser = reowUser;
    }

    @Override
    public String toString() {
        return "reow{" +
                "reowId=" + reowId +
                ", rewoName='" + rewoName + '\'' +
                ", reowUser=" + reowUser +
                '}';
    }
}
