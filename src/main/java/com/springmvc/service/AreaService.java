package com.springmvc.service;

import com.springmvc.bean.Area;
import com.springmvc.bean.Customer;
import com.springmvc.bean.Employee;

import java.util.List;

/**
 * @author Mr Li
 * @create 2019
 */
public interface AreaService {
    //查询所有区域
    public List<Area> getAllArea();
}
