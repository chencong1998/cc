package com.springmvc.controller;

import com.springmvc.bean.Customertype;
import com.springmvc.service.CustomertypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 客户类型控制层
 */
@Controller
@RequestMapping("/customertype")
public class CustomertypeController {


    @Autowired
    private CustomertypeService customertypeService;

    //客户类型列表
   /* @RequestMapping("/customertypePage")
    public @ResponseBody Map<String, Object> customertypePage(int page,int limit){
        System.out.println("客户类型列表：page:"+page+" limit:"+limit);
        List<Customertype> list=customertypeService.customertypePage(page,limit); //查询显示信息
        System.out.println(list);

        List<Customertype> count = customertypeService.customertypeAll(); //查询所有记录数
        System.out.println(count);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("msg", "");
        map.put("code", 0);
        map.put("count", count.size());
        map.put("data", list);
        return map;
    }*/

    //判断客户类型是否存在
    @RequestMapping("/customertypeName")
    public @ResponseBody int customertypeName(String customertypename){
        System.out.println(customertypename);
       Customertype customertype= customertypeService.customertypeSelect(customertypename);
       if (customertype!=null) //判断客户类型是否存在
           return 1;
       else
           return 0;
    }



    //添加客户类型
    @RequestMapping("/customertypeAdd")
    public String customertypeAdd(Customertype customertype,Model model){
        System.out.println("添加："+customertype);
        int k=customertypeService.customertypeAdd(customertype);
        if (k>0) {
            model.addAttribute("customertypeAdd", "添加成功");
        }else {
            model.addAttribute("customertypeAdd","添加失败");
        }
        return "forward:/load/custTypeAdd";

    }

    //删除客户类型
    @RequestMapping("/customertypeDelete")
    public @ResponseBody int customertypeDelete(int id) {
        System.out.println("删除客户类型：" + id);
        try {
            int k = customertypeService.customertypeDelete(id);

            System.out.println("k:" + k);
            return k;

        } catch (Exception e) {
            return 0;
        }

    }

    //修改信息
    @RequestMapping("/customertypeUpdate")
    public String customertypeUpdate(Customertype customertype,Model model){
        System.out.println("修改信息："+customertype);
        int k=customertypeService.customertypeUpdate(customertype);
        if (k>0){
            model.addAttribute("customertypeUpdate","修改成功");
        }else {
            model.addAttribute("customertypeUpdate","修改失败");
            //回显数据
            model.addAttribute("custType",customertype);

        }
        return "view/custTypeUpdate";
    }
}
