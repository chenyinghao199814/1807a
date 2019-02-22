package com.jk.bean;

public class Ardess {

    private Integer id;

    private String atitle;

    private Integer pid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAtitle() {
        return atitle;
    }

    public void setAtitle(String atitle) {
        this.atitle = atitle;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }


    @Override
    public String toString() {
        return "Ardess{" +
                "id=" + id +
                ", atitle='" + atitle + '\'' +
                ", pid=" + pid +
                '}';
    }
}
