package com.springmvc.service.impl;

import com.springmvc.bean.Paidtype;
import com.springmvc.bean.PaidtypeExample;
import com.springmvc.mapper.PaidtypeMapper;
import com.springmvc.service.PaidtypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaidtypeServiceImpl implements PaidtypeService {

    @Autowired
    private PaidtypeMapper paidtypeMapper;


    //查询所有支付方式
    @Override
    public List<Paidtype> paidtypeAll() {

        return paidtypeMapper.selectByExample(null);
    }

    //查询单个支付方式
    @Override
    public Paidtype paidtypeSelect(int id) {
        return paidtypeMapper.selectByPrimaryKey(id);
    }
/*
    //分页查询
    public List<Paidtype> paidtypePage(int currPage, int limit){
        PaidtypeExample paidtypeExample = new PaidtypeExample();
        //设置当前查询位置
        paidtypeExample.setCurrPage((currPage-1)*limit);
        //设置查询记录数
        paidtypeExample.setLimit(limit);
        return paidtypeMapper.selectByExample(paidtypeExample);
    }*/

    //删除支付方式
    public int paidtypeDelete(int paidtypeId){
        return paidtypeMapper.deleteByPrimaryKey(paidtypeId);
    }

    //修改支付方式
    public int paidtypeUpdate(Paidtype paidtype){
        return paidtypeMapper.updateByPrimaryKey(paidtype);
    }

    //支付方式名称查询
    public Paidtype paidtypeSelect(String paidtypeName){
        PaidtypeExample paidtypeExample = new PaidtypeExample();
        paidtypeExample.createCriteria().andPaidnameEqualTo(paidtypeName); //支付方式名称查询
        List<Paidtype> list = paidtypeMapper.selectByExample(paidtypeExample);
        if (list.size()>0)
            return list.get(0);
        else
            return null;
    }

    //添加支付方式
    public int paidtypeAdd(Paidtype paidtype){
        return paidtypeMapper.insertSelective(paidtype);
    }
}
