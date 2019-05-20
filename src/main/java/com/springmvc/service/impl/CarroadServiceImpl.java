package com.springmvc.service.impl;

import com.springmvc.bean.Carroad;
import com.springmvc.bean.CarroadExample;
import com.springmvc.mapper.CarroadMapper;
import com.springmvc.service.CarroadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroadServiceImpl implements CarroadService {

    @Autowired
    private CarroadMapper carroadMapper;

    //查询所有途径线路
    @Override
    public List<Carroad> carroadAll() {
        return carroadMapper.selectByExample(null);
    }

   /* //分页查询
    @Override
    public List<Carroad> carroadPage(int currPage, int limit) {
        CarroadExample carroadExample = new CarroadExample();
        //设置当前查询位置
        carroadExample.setCurrPage((currPage-1)*limit);
        //设置查询记录数
        carroadExample.setLimit(limit);

        CarroadExample.Criteria criteria = carroadExample.createCriteria();
        List<Carroad> list=carroadMapper.selectByExample(carroadExample);
        return list;
    }*/

    //查看单个信息
    @Override
    public Carroad carroadById(int id) {
        return carroadMapper.selectByPrimaryKey(id);
    }

    //删除途径线路信息
    @Override
    public int carroadDeleteId(int id) {
        return carroadMapper.deleteByPrimaryKey(id);
    }

    //添加途径线路
    @Override
    public int carroadAdd(Carroad carroad) {
        return carroadMapper.insertSelective(carroad);
    }

    //修改途径线路
    @Override
    public int carroadUpdate(Carroad carroad) {
        return carroadMapper.updateByPrimaryKey(carroad);
    }

   /* //查看客户途径线路
    @Override
    public List<Carroad> carroadByCus(int transId,int currPage, int limit) {
        CarroadExample carroadExample = new CarroadExample();
        CarroadExample.Criteria criteria = carroadExample.createCriteria();
        //设置当前查询位置
        carroadExample.setCurrPage((currPage-1)*limit);
        //设置查询记录数
        carroadExample.setLimit(limit);
        criteria.andTransidEqualTo(transId);
        List<Carroad> list=carroadMapper.selectByExample(carroadExample);
        return list;
    }*/

    /*//查看客户所有途径线路
    @Override
    public int carroadByCus(int transId) {
        CarroadExample carroadExample = new CarroadExample();
        CarroadExample.Criteria criteria = carroadExample.createCriteria();
        criteria.andTransidEqualTo(transId);
        return carroadMapper.countByExample(carroadExample);
    }*/



}
