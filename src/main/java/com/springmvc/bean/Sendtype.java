package com.springmvc.bean;

public class Sendtype {
    private Integer sendtypeid;

    private String sendtypename;

    public Integer getSendtypeid() {
        return sendtypeid;
    }

    public void setSendtypeid(Integer sendtypeid) {
        this.sendtypeid = sendtypeid;
    }

    public String getSendtypename() {
        return sendtypename;
    }

    public void setSendtypename(String sendtypename) {
        this.sendtypename = sendtypename == null ? null : sendtypename.trim();
    }
}