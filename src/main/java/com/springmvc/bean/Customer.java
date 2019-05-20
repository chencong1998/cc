package com.springmvc.bean;

import java.math.BigDecimal;

public class Customer {
    private Integer customerid;

    private String customername;

    private String contactname;

    private String phone;

    private Integer paidid;

    private String addr;

    private Integer areaid;

    private Integer customertypeid;

    private BigDecimal factmoney;

    private BigDecimal paidmoney;

    private Paidtype paidtype;//支付方式
    private Area area;//区域
    private Customertype customertype;//客户类型

    public Paidtype getPaidtype() {
        return paidtype;
    }

    public void setPaidtype(Paidtype paidtype) {
        this.paidtype = paidtype;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Customertype getCustomertype() {
        return customertype;
    }

    public void setCustomertype(Customertype customertype) {
        this.customertype = customertype;
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
    }

    public String getContactname() {
        return contactname;
    }

    public void setContactname(String contactname) {
        this.contactname = contactname == null ? null : contactname.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getPaidid() {
        return paidid;
    }

    public void setPaidid(Integer paidid) {
        this.paidid = paidid;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public Integer getAreaid() {
        return areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    public Integer getCustomertypeid() {
        return customertypeid;
    }

    public void setCustomertypeid(Integer customertypeid) {
        this.customertypeid = customertypeid;
    }

    public BigDecimal getFactmoney() {
        return factmoney;
    }

    public void setFactmoney(BigDecimal factmoney) {
        this.factmoney = factmoney;
    }

    public BigDecimal getPaidmoney() {
        return paidmoney;
    }

    public void setPaidmoney(BigDecimal paidmoney) {
        this.paidmoney = paidmoney;
    }

}