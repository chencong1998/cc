package com.springmvc.service.impl;

import com.springmvc.bean.Customertype;
import com.springmvc.bean.CustomertypeExample;
import com.springmvc.mapper.CustomertypeMapper;
import com.springmvc.service.CustomertypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomertypeServiceImpl implements CustomertypeService {

    @Autowired
    private CustomertypeMapper customertypeMapper;


    //查询所有客户
    @Override
    public List<Customertype> customertypeAll() {

        return customertypeMapper.selectByExample(null);
    }

    //查询单个客户
    @Override
    public Customertype customertypeSelect(int id) {
        return customertypeMapper.selectByPrimaryKey(id);
    }

    /*//分页查询
    public List<Customertype> customertypePage(int currPage, int limit){
        CustomertypeExample customertypeExample = new CustomertypeExample();
        //设置当前查询位置
        customertypeExample.setCurrPage((currPage-1)*limit);
        //设置查询记录数
        customertypeExample.setLimit(limit);
        return customertypeMapper.selectByExample(customertypeExample);
    }*/

    //删除客户类型
    public int customertypeDelete(int customertypeId){
        return customertypeMapper.deleteByPrimaryKey(customertypeId);
    }

    //修改客户类型
    public int customertypeUpdate(Customertype customertype){
        return customertypeMapper.updateByPrimaryKey(customertype);
    }

    //客户类型名称查询
    public Customertype customertypeSelect(String customertypeName){
        CustomertypeExample customertypeExample = new CustomertypeExample();
        customertypeExample.createCriteria().andCustomertypenameEqualTo(customertypeName); //客户类型名称查询
        List<Customertype> list = customertypeMapper.selectByExample(customertypeExample);
        if (list.size()>0)
            return list.get(0);
        else
            return null;
    }

    //添加客户类型
    public int customertypeAdd(Customertype customertype){
        return customertypeMapper.insertSelective(customertype);
    }
}
