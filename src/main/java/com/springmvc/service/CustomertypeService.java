package com.springmvc.service;

import com.springmvc.bean.Customertype;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 客户类型业务接口
 */
@Service
@Transactional
public interface CustomertypeService {

    //查询所有
    public List<Customertype> customertypeAll();

    //查询单个
    public Customertype customertypeSelect(int id);

   /* //分页查询
    public List<Customertype> customertypePage(int currPage, int limit);*/

    //删除客户类型
    public int customertypeDelete(int customertypeId);

    //修改客户类型
    public int customertypeUpdate(Customertype customertype);

    //客户类型名称查询
    public Customertype customertypeSelect(String customertypeName);

    //添加客户类型
    public int customertypeAdd(Customertype customertype);
}
