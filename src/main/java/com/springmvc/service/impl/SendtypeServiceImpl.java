package com.springmvc.service.impl;

import com.springmvc.bean.Sendtype;
import com.springmvc.bean.SendtypeExample;
import com.springmvc.mapper.SendtypeMapper;
import com.springmvc.service.SendtypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SendtypeServiceImpl implements SendtypeService {

    @Autowired
    private SendtypeMapper sendtypeMapper;


    //查询所有运输工具
    @Override
    public List<Sendtype> sendtypeAll() {

        return sendtypeMapper.selectByExample(null);
    }

    //查询单个运输工具
    @Override
    public Sendtype sendtypeSelect(int id) {
        return sendtypeMapper.selectByPrimaryKey(id);
    }

    /*//分页查询
    public List<Sendtype> sendtypePage(int currPage, int limit){
        SendtypeExample sendtypeExample = new SendtypeExample();
        //设置当前查询位置
        sendtypeExample.setCurrPage((currPage-1)*limit);
        //设置查询记录数
        sendtypeExample.setLimit(limit);
        return sendtypeMapper.selectByExample(sendtypeExample);
    }*/

    //删除运输工具
    public int sendtypeDelete(int sendtypeId){
        return sendtypeMapper.deleteByPrimaryKey(sendtypeId);
    }

    //修改运输工具
    public int sendtypeUpdate(Sendtype sendtype){
        return sendtypeMapper.updateByPrimaryKey(sendtype);
    }

    //运输工具名称查询
    public Sendtype sendtypeSelect(String sendtypeName){
        SendtypeExample sendtypeExample = new SendtypeExample();
        sendtypeExample.createCriteria().andSendtypenameEqualTo(sendtypeName); //运输工具名称查询
        List<Sendtype> list = sendtypeMapper.selectByExample(sendtypeExample);
        if (list.size()>0)
            return list.get(0);
        else
            return null;
    }

    //添加运输工具
    public int sendtypeAdd(Sendtype sendtype){
        return sendtypeMapper.insertSelective(sendtype);
    }
}
