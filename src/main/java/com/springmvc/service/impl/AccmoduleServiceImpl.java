package com.springmvc.service.impl;

import com.springmvc.bean.Accmodule;
import com.springmvc.bean.AccmoduleExample;
import com.springmvc.mapper.AccmoduleMapper;
import com.springmvc.service.AccmoduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 用户访问模块业务实现类
 */
@Service
public class AccmoduleServiceImpl implements AccmoduleService {

    @Autowired
    private AccmoduleMapper accmoduleMapper;

    //用户模块查询
    public List<Accmodule> accmoduleModify(int usersId){
        AccmoduleExample accmoduleExample = new AccmoduleExample();
        accmoduleExample.createCriteria().andUseridEqualTo(usersId); //查看用户Id
        return accmoduleMapper.selectByExample(accmoduleExample);
    }

    //删除用户所有模块
    public int deleteByUsers(int usersId){
        AccmoduleExample accmoduleExample = new AccmoduleExample();
        accmoduleExample.createCriteria().andUseridEqualTo(usersId); //用户Id
        return accmoduleMapper.deleteByExample(accmoduleExample);
    }

    //删除用户指定模块
    public int deleteByIds(List<Integer> moduleId){
        AccmoduleExample accmoduleExample = new AccmoduleExample();
        accmoduleExample.createCriteria().andIdIn(moduleId); //删除所有指定的Id
        return accmoduleMapper.deleteByExample(accmoduleExample);
    }

    //添加用户模板
    public int addAccmodule(String [] moduleId,int userId){
        for (String m:moduleId
             ) {
            System.out.println(m);
        }
        System.out.println("userId:"+userId);
        return accmoduleMapper.insertBatch(moduleId,userId);
    }
}
