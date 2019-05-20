package com.springmvc.service.impl;

import com.springmvc.bean.Orderstatus;
import com.springmvc.bean.OrderstatusExample;
import com.springmvc.mapper.OrderstatusMapper;
import com.springmvc.service.OrderstatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderstatusServiceImpl implements OrderstatusService {

    @Autowired
    private OrderstatusMapper orderMapper;


    //查询所有订单状态
    @Override
    public List<Orderstatus> orderAll() {

        return orderMapper.selectByExample(null);
    }

    //查询单个订单状态
    @Override
    public Orderstatus orderSelect(int id) {
        return orderMapper.selectByPrimaryKey(id);
    }

    /*//分页查询
    public List<Orderstatus> orderPage(int currPage, int limit){
        OrderstatusExample orderExample = new OrderstatusExample();
        //设置当前查询位置
        orderExample.setCurrPage((currPage-1)*limit);
        //设置查询记录数
        orderExample.setLimit(limit);
        return orderMapper.selectByExample(orderExample);
    }*/

    //删除订单状态
    public int orderDelete(int orderId){
        return orderMapper.deleteByPrimaryKey(orderId);
    }

    //修改订单状态
    public int orderUpdate(Orderstatus order){
        return orderMapper.updateByPrimaryKey(order);
    }

    //订单状态名称查询
    public Orderstatus orderSelect(String orderName){
        OrderstatusExample orderExample = new OrderstatusExample();
        orderExample.createCriteria().andOrdernameEqualTo(orderName); //订单状态名称查询
        List<Orderstatus> list = orderMapper.selectByExample(orderExample);
        if (list.size()>0)
            return list.get(0);
        else
            return null;
    }

    //添加订单状态
    public int orderAdd(Orderstatus order){
        return orderMapper.insertSelective(order);
    }
}
