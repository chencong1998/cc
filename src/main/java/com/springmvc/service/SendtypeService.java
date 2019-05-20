package com.springmvc.service;

import com.springmvc.bean.Sendtype;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 运输工具类型业务接口
 */
@Service
@Transactional
public interface SendtypeService {

    //查询所有
    public List<Sendtype> sendtypeAll();

    //查询单个
    public Sendtype sendtypeSelect(int id);

    /*//分页查询
    public List<Sendtype> sendtypePage(int currPage, int limit);*/

    //删除运输工具
    public int sendtypeDelete(int sendtypeId);

    //修改运输工具
    public int sendtypeUpdate(Sendtype sendtype);

    //运输工具名称查询
    public Sendtype sendtypeSelect(String sendtypeName);

    //添加运输工具
    public int sendtypeAdd(Sendtype sendtype);
}
