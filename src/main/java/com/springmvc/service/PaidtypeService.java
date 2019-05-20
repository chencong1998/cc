package com.springmvc.service;

import com.springmvc.bean.Paidtype;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 支付方式业务接口
 */
@Service
@Transactional
public interface PaidtypeService {

    //查询所有
    public List<Paidtype> paidtypeAll();

    //查询单个
    public Paidtype paidtypeSelect(int id);
/*
    //分页查询
    public List<Paidtype> paidtypePage(int currPage, int limit);*/

    //删除支付方式
    public int paidtypeDelete(int paidtypeId);

    //修改支付方式
    public int paidtypeUpdate(Paidtype paidtype);

    //支付方式名称查询
    public Paidtype paidtypeSelect(String paidtypeName);

    //添加支付方式
    public int paidtypeAdd(Paidtype paidtype);
}
