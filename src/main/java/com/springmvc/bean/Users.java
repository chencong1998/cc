package com.springmvc.bean;

public class Users {
    private Integer id;

    private String username;

    private String password;

    private Integer areaid;

    private String depname;

    private String degree;

    private String mobile;

    private String addr;

    private Integer staus;

    private String companyname;

    private String demo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getAreaid() {
        return areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    public String getDepname() {
        return depname;
    }

    public void setDepname(String depname) {
        this.depname = depname == null ? null : depname.trim();
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree == null ? null : degree.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public Integer getStaus() {
        return staus;
    }

    public void setStaus(Integer staus) {
        this.staus = staus;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getDemo() {
        return demo;
    }

    public void setDemo(String demo) {
        this.demo = demo == null ? null : demo.trim();
    }

    public Users(Integer id, String username, String password, Integer areaid, String depname, String degree, String mobile, String addr, Integer staus, String companyname, String demo) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.areaid = areaid;
        this.depname = depname;
        this.degree = degree;
        this.mobile = mobile;
        this.addr = addr;
        this.staus = staus;
        this.companyname = companyname;
        this.demo = demo;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", areaid=" + areaid +
                ", depname='" + depname + '\'' +
                ", degree='" + degree + '\'' +
                ", mobile='" + mobile + '\'' +
                ", addr='" + addr + '\'' +
                ", staus=" + staus +
                ", companyname='" + companyname + '\'' +
                ", demo='" + demo + '\'' +
                '}';
    }

    public Users() {
    }
}