package com.springmvc.controller;

import com.springmvc.bean.Sendtype;
import com.springmvc.service.SendtypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 运输工具控制层
 */
@Controller
@RequestMapping("/sendtype")
public class SendtypeController {


    @Autowired
    private SendtypeService sendtypeService;


    //运输工具列表
   /* @RequestMapping("/sendtypePage")
    public @ResponseBody Map<String, Object> sendtypePage(int page,int limit){
        System.out.println("运输工具列表：page:"+page+" limit:"+limit);
        List<Sendtype> list=sendtypeService.sendtypePage(page,limit); //查询显示信息
        System.out.println(list);

        List<Sendtype> count = sendtypeService.sendtypeAll(); //查询所有记录数
        System.out.println(count);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("msg", "");
        map.put("code", 0);
        map.put("count", count.size());
        map.put("data", list);
        return map;
    }*/

    //判断运输工具是否存在
    @RequestMapping("/sendtypeName")
    public @ResponseBody int sendtypeName(String sendtypename){
        System.out.println(sendtypename);
       Sendtype sendtype= sendtypeService.sendtypeSelect(sendtypename);
       if (sendtype!=null) //判断运输工具是否存在
           return 1;
       else
           return 0;
    }



    //添加运输工具
    @RequestMapping("/sendtypeAdd")
    public String sendtypeAdd(Sendtype sendtype,Model model){
        System.out.println("添加："+sendtype);
        int k=sendtypeService.sendtypeAdd(sendtype);
        if (k>0) {
            model.addAttribute("sendtypeAdd", "添加成功");
        }else {
            model.addAttribute("sendtypeAdd","添加失败");
        }
        return "forward:/load/sendTypeAdd";

    }

    //删除运输工具
    @RequestMapping("/sendtypeDelete")
    public @ResponseBody int sendtypeDelete(int id) {
        System.out.println("删除运输工具：" + id);
        try {
            int k = sendtypeService.sendtypeDelete(id);

            System.out.println("k:" + k);
            return k;

        } catch (Exception e) {
            return 0;
        }

    }

    //修改信息
    @RequestMapping("/sendtypeUpdate")
    public String sendtypeUpdate(Sendtype sendtype,Model model){
        System.out.println("修改信息："+sendtype);
        int k=sendtypeService.sendtypeUpdate(sendtype);
        if (k>0){
            model.addAttribute("sendtypeUpdate","修改成功");
        }else {
            model.addAttribute("sendtypeUpdate","修改失败");
            //回显数据
            model.addAttribute("send",sendtype);

        }
        return "view/sendTypeUpdate";
    }
}
