package com.springmvc.service;


import com.springmvc.bean.Accmodule;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 访问模块业务接口
 */
@Service
@Transactional
public interface AccmoduleService {

    //用户模块查询
    public List<Accmodule> accmoduleModify(int usersId);

    //删除用户所有模块
    public int deleteByUsers(int usersId);

    //删除用户指定模块
    public int deleteByIds(List<Integer> moduleId);

    //添加用户模板
    public int addAccmodule(String[] moduleId, int userId);
}
