package com.springmvc.bean;

import java.math.BigDecimal;
import java.util.Date;

public class Balance {
    private Integer balanceid;

    private Integer customerid;

    private BigDecimal facefee;

    private String paidtype;

    private Date paidtime;

    private Date oprtime;

    private Integer userid;

    private String isvalid;

    private String demo;
    private Customer customer;
    private Users users;

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Integer getBalanceid() {
        return balanceid;
    }

    public void setBalanceid(Integer balanceid) {
        this.balanceid = balanceid;
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public BigDecimal getFacefee() {
        return facefee;
    }

    public void setFacefee(BigDecimal facefee) {
        this.facefee = facefee;
    }

    public String getPaidtype() {
        return paidtype;
    }

    public void setPaidtype(String paidtype) {
        this.paidtype = paidtype == null ? null : paidtype.trim();
    }

    public Date getPaidtime() {
        return paidtime;
    }

    public void setPaidtime(Date paidtime) {
        this.paidtime = paidtime;
    }

    public Date getOprtime() {
        return oprtime;
    }

    public void setOprtime(Date oprtime) {
        this.oprtime = oprtime;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getIsvalid() {
        return isvalid;
    }

    public void setIsvalid(String isvalid) {
        this.isvalid = isvalid == null ? null : isvalid.trim();
    }

    public String getDemo() {
        return demo;
    }

    public void setDemo(String demo) {
        this.demo = demo == null ? null : demo.trim();
    }
}