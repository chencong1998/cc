package com.springmvc.service;

import com.springmvc.bean.Car;
import com.springmvc.bean.Carroad;
import com.springmvc.bean.Sendtype;
import com.springmvc.bean.Transcar;

import java.util.List;

/**
 * @author Mr Li
 * @create 2019
 */
public interface TranscarService {
    public List<Transcar> getAlltranscar();
    public Transcar getOnetran(int id);
    public int addCarRoad(Carroad carroad);
    public List<Car> getAllCar();
    public List<Sendtype> getAllsendtype();
    public int addTran(Transcar transcar);
    public int deltran(int tid);
}
