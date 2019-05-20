package com.springmvc.service;

import com.springmvc.bean.Module;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 模块业务接口
 */
@Service
@Transactional
public interface ModuleService {

    //查看所有模块信息
    public List<Module> moduleAll();
}
