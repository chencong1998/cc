package com.springmvc.service;

import com.springmvc.bean.Carroad;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 途径路线业务接口
 */
@Service
@Transactional
public interface CarroadService {

    //查询所有途径路线
    public List<Carroad> carroadAll();

    /*//分页查询
    public List<Carroad> carroadPage(int currPage, int limit);*/

    //查询信息
    public Carroad carroadById(int id);

    //删除途径路线
    public int carroadDeleteId(int id);

    //添加途径路线
    public int carroadAdd(Carroad carroad);

    //修改途径路线
    public int carroadUpdate(Carroad carroad);

    /*//查看车辆途径路线
    public List<Carroad> carroadByCus(int transId, int currPage, int limit);*/

    /*//查看车辆所有途径路线
    public int carroadByCus(int transId);*/

}

