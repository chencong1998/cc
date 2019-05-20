package com.springmvc.service;

import com.springmvc.bean.Car;
import com.springmvc.bean.Customer;

import java.util.List;

/**
 * @author Mr Li
 * @create 2019
 */
public interface CarService {
    public List<Car> getAllCar();
    public int addCar(Car car);
    public List<Customer> getAllCustomer();
    public Car getCar(int id);
    public int modifyCarDo(Car car);
    public List<Car> getAllSelectcar(int carid);
    public int delCar(int id);
}
