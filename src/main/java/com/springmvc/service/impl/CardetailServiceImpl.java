package com.springmvc.service.impl;

import com.springmvc.bean.Cardetail;
import com.springmvc.mapper.CardetailMapper;
import com.springmvc.service.CardetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mr Li
 * @create 2019
 */
@Service
public class CardetailServiceImpl implements CardetailService {
    @Autowired
    private CardetailMapper cardetailMapper;
    @Override
    public List<Cardetail> getAllcardetail() {
        return cardetailMapper.selectByExampleWithother(1);
    }

    @Override
    public List<Cardetail> selectByExampleWithother1(String sta,String i0, String i2, String i3, String i4, String i5, String i6) {
        return cardetailMapper.selectByExampleWithother1(sta,i0,i2,i3,i4,i5,i6);
    }
}
