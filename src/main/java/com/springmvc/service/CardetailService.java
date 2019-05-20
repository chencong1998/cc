package com.springmvc.service;

import com.springmvc.bean.Cardetail;

import java.util.List;

/**
 * @author Mr Li
 * @create 2019
 */
public interface CardetailService {
    public List<Cardetail> getAllcardetail();
    public List<Cardetail> selectByExampleWithother1(String sta,String i0,String i2,String i3,String i4,String i5,String i6);
}
