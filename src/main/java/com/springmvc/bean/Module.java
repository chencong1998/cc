package com.springmvc.bean;

public class Module {
    private Integer moduleid;

    private String modulename;

    private String classname;

    private String moethod;

    public Integer getModuleid() {
        return moduleid;
    }

    public void setModuleid(Integer moduleid) {
        this.moduleid = moduleid;
    }

    public String getModulename() {
        return modulename;
    }

    public void setModulename(String modulename) {
        this.modulename = modulename == null ? null : modulename.trim();
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public String getMoethod() {
        return moethod;
    }

    public void setMoethod(String moethod) {
        this.moethod = moethod == null ? null : moethod.trim();
    }
}