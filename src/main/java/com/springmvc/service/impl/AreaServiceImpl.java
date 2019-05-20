package com.springmvc.service.impl;

import com.springmvc.bean.Area;
import com.springmvc.mapper.AreaMapper;
import com.springmvc.mapper.EmployeeMapper;
import com.springmvc.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mr Li
 * @create 2019
 */
@Service
public class AreaServiceImpl implements AreaService{
    @Autowired
    private AreaMapper areaMapper;
    @Override
    public List<Area> getAllArea() {
        return areaMapper.selectByExample(null);
    }
}
