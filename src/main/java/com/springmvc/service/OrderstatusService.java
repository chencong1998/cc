package com.springmvc.service;

import com.springmvc.bean.Orderstatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 订单状态业务接口
 */
@Service
@Transactional
public interface OrderstatusService {

    //查询所有
    public List<Orderstatus> orderAll();

    //查询单个
    public Orderstatus orderSelect(int id);

    /*//分页查询
    public List<Orderstatus> orderPage(int currPage, int limit);*/

    //删除订单状态
    public int orderDelete(int orderId);

    //修改订单状态
    public int orderUpdate(Orderstatus order);

    //订单状态名称查询
    public Orderstatus orderSelect(String orderName);

    //添加订单状态
    public int orderAdd(Orderstatus order);
}
