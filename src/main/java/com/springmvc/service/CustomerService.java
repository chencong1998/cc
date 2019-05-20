package com.springmvc.service;

import com.springmvc.bean.*;

import java.util.List;

/**
 * @author Mr Li
 * @create 2019
 */
public interface CustomerService {
    public List<Customer> getAllCustomer();
    public List<Customer> getAllCustomer1();
    public Customer getOneCus(int id);
    public int addbana(Balance balance);
    public List<Balance> getAllbalance(int cusid);
    public int zuoFei(Balance balance);
    public List<Cardetail> getAllCardetail(int cusid);
    public List<Paidtype> getAllPaidType();
    public List<Customertype> getAllCustomerType();
    public int modifyCus(Customer customer);
    public List<Customer> getAllSelectcus(int id);
    public int delCus(int cid);
    public int addCusDo(Customer customer);
}
