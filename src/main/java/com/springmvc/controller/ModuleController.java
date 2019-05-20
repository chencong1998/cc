package com.springmvc.controller;

import com.springmvc.bean.Module;
import com.springmvc.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 模块控制层
 */
@Controller
@RequestMapping("/module")
public class ModuleController {


    @Autowired
    private ModuleService moduleService;


    //查看所有模块列表
    @RequestMapping("/moduleModify")
    public @ResponseBody Map<String, Object> moduleModify(){
        List<Module> list=moduleService.moduleAll(); //查询显示信息
        System.out.println(list);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("msg", "");
        map.put("code", 0);
        map.put("count", list.size());
        map.put("data", list);
        return map;
    }



}
