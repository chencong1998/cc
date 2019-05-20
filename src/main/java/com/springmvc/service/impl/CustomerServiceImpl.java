package com.springmvc.service.impl;

import com.springmvc.bean.*;
import com.springmvc.mapper.*;
import com.springmvc.service.CustomerService;
import com.springmvc.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mr Li
 * @create 2019
 */
@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerMapper customerMapper;
    @Autowired
    private BalanceMapper balanceMapper;
    @Autowired
    private CardetailMapper cardetailMapper;
    @Autowired
    private PaidtypeMapper paidtypeMapper;
    @Autowired
    private CustomertypeMapper customertypeMapper;

    @Override
    public List<Customer> getAllCustomer() {
        return customerMapper.selectByExampleWithother(null);
    }
    @Override
    public List<Customer> getAllCustomer1() {
        return customerMapper.selectByExample(null);
    }

    @Override
    public Customer getOneCus(int id) {
        return customerMapper.selectByPrimaryKey(id);
    }

    @Override
    public int addbana(Balance balance) {
        return balanceMapper.insertSelective(balance);
    }

    @Override
    public List<Balance> getAllbalance(int customerID) {
        /*BalanceExample example=new BalanceExample();
        BalanceExample.Criteria criteria = example.createCriteria();
        criteria.andCustomeridEqualTo(cusid);*/
        return balanceMapper.selectByExampleWithOther1(customerID);
    }

    @Override
    public int zuoFei(Balance balance) {
        return balanceMapper.updateByPrimaryKeySelective(balance);
    }

    @Override
    public List<Cardetail> getAllCardetail(int customerID) {
        return cardetailMapper.selectByExampleWithother(customerID);
    }

    @Override
    public List<Paidtype> getAllPaidType() {
        return paidtypeMapper.selectByExample(null);
    }

    @Override
    public List<Customertype> getAllCustomerType() {
        return customertypeMapper.selectByExample(null);
    }

    @Override
    public int modifyCus(Customer customer) {
        return customerMapper.updateByPrimaryKeySelective(customer);
    }

    @Override
    public List<Customer> getAllSelectcus(int id) {
        CustomerExample example=new CustomerExample();
        CustomerExample.Criteria criteria = example.createCriteria();
        criteria.andCustomeridLessThanOrEqualTo(id);
        return customerMapper.selectByExample(example);
    }

    @Override
    public int delCus(int cid) {
        return customerMapper.deleteByPrimaryKey(cid);
    }

    @Override
    public int addCusDo(Customer customer) {
        return customerMapper.insertSelective(customer);
    }
}
