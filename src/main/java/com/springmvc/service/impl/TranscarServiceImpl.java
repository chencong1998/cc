package com.springmvc.service.impl;

import com.springmvc.bean.Car;
import com.springmvc.bean.Carroad;
import com.springmvc.bean.Sendtype;
import com.springmvc.bean.Transcar;
import com.springmvc.mapper.CarMapper;
import com.springmvc.mapper.CarroadMapper;
import com.springmvc.mapper.SendtypeMapper;
import com.springmvc.mapper.TranscarMapper;
import com.springmvc.service.TranscarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mr Li
 * @create 2019
 */
@Service
public class TranscarServiceImpl implements TranscarService{
    @Autowired
    private TranscarMapper transcarMapper;
    @Autowired
    private CarroadMapper carroadMapper;
    @Autowired
    private SendtypeMapper sendtypeMapper;
    @Autowired
    private CarMapper carMapper;

    @Override
    public List<Transcar> getAlltranscar() {
        return transcarMapper.selectByExampleWithother(null);
    }

    @Override
    public Transcar getOnetran(int id) {
        return transcarMapper.selectByPrimaryKeyWithother(id);
    }

    @Override
    public int addCarRoad(Carroad carroad) {
        return carroadMapper.insertSelective(carroad);
    }

    @Override
    public List<Car> getAllCar() {
        return carMapper.selectByExample(null);
    }

    @Override
    public List<Sendtype> getAllsendtype() {
        return sendtypeMapper.selectByExample(null);
    }

    @Override
    public int addTran(Transcar transcar) {
        return transcarMapper.updateByPrimaryKeySelective(transcar);
    }

    @Override
    public int deltran(int tid) {
        return transcarMapper.deleteByPrimaryKey(tid);
    }
}
