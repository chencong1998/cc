package com.springmvc.bean;

import java.util.Date;

public class Carroad {
    private Integer roadid;

    private Integer transid;

    private Integer startcity;

    private Date starttime;

    private Integer endcity;

    private Date endtime;

    public Integer getRoadid() {
        return roadid;
    }

    public void setRoadid(Integer roadid) {
        this.roadid = roadid;
    }

    public Integer getTransid() {
        return transid;
    }

    public void setTransid(Integer transid) {
        this.transid = transid;
    }

    public Integer getStartcity() {
        return startcity;
    }

    public void setStartcity(Integer startcity) {
        this.startcity = startcity;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Integer getEndcity() {
        return endcity;
    }

    public void setEndcity(Integer endcity) {
        this.endcity = endcity;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }
}