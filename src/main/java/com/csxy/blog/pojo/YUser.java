package com.csxy.blog.pojo;

/**
 * @Author: jamin
 * @CreatTime: 2022-11-07-8:14
 * @Description:
 */
public class YUser {
    private Integer yid;
    private String yName;
    private String pwd;
    private String comment;

    public YUser() {
    }

    public YUser(Integer yid, String yName, String pwd, String comment) {
        this.yid = yid;
        this.yName = yName;
        this.pwd = pwd;
        this.comment = comment;
    }

    public Integer getYid() {
        return yid;
    }

    public void setYid(Integer Yid) {
        this.yid = yid;
    }

    public String getYName() {
        return yName;
    }

    public void setYName(String YName) {
        this.yName = YName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "YUser{" +
                "yid=" + yid +
                ", yName='" + yName + '\'' +
                ", pwd='" + pwd + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
