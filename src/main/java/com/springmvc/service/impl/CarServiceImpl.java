package com.springmvc.service.impl;

import com.springmvc.bean.*;
import com.springmvc.mapper.CarMapper;
import com.springmvc.mapper.CustomerMapper;
import com.springmvc.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mr Li
 * @create 2019
 */
@Service
public class CarServiceImpl implements CarService{
    @Autowired
    private CarMapper carMapper;
    @Autowired
    private CustomerMapper customerMapper;
    public List<Car> getAllCar() {
        return carMapper.selectByExampleWithother(null);
    }

    @Override
    public int addCar(Car car) {
        return carMapper.insertSelective(car);
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerMapper.selectByExample(null);
    }

    @Override
    public Car getCar(int id) {
        return carMapper.selectByPrimaryKey(id);
    }

    @Override
    public int modifyCarDo(Car car) {
        return carMapper.updateByPrimaryKeySelective(car);
    }

    @Override
    public List<Car> getAllSelectcar(int carid) {
        CarExample example=new CarExample();
        CarExample.Criteria criteria = example.createCriteria();
        criteria.andCaridLessThanOrEqualTo(carid);
        return carMapper.selectByExample(example);
    }

    @Override
    public int delCar(int id) {
        return carMapper.deleteByPrimaryKey(id);
    }
}
