package com.springmvc.controller;

import com.springmvc.bean.Paidtype;
import com.springmvc.service.PaidtypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 付款方式控制层
 */
@Controller
@RequestMapping("/paidtype")
public class PaidtypeController {


    @Autowired
    private PaidtypeService paidtypeService;

    //付款方式列表
    /*@RequestMapping("/paidtypePage")
    public @ResponseBody Map<String, Object> paidtypePage(int page,int limit){
        System.out.println("付款方式列表：page:"+page+" limit:"+limit);
        List<Paidtype> list=paidtypeService.paidtypePage(page,limit); //查询显示信息
        System.out.println(list);

        List<Paidtype> count = paidtypeService.paidtypeAll(); //查询所有记录数
        System.out.println(count);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("msg", "");
        map.put("code", 0);
        map.put("count", count.size());
        map.put("data", list);
        return map;
    }*/

    //判断付款方式是否存在
    @RequestMapping("/paidtypeName")
    public @ResponseBody int paidtypeName(String paidtypename){
        System.out.println(paidtypename);
       Paidtype paidtype= paidtypeService.paidtypeSelect(paidtypename);
       if (paidtype!=null) //判断付款方式是否存在
           return 1;
       else
           return 0;
    }



    //添加付款方式
    @RequestMapping("/paidtypeAdd")
    public String paidtypeAdd(Paidtype paidtype,Model model){
        System.out.println("添加："+paidtype);
        int k=paidtypeService.paidtypeAdd(paidtype);
        if (k>0) {
            model.addAttribute("paidtypeAdd", "添加成功");
        }else {
            model.addAttribute("paidtypeAdd","添加失败");
        }
        return "forward:/load/paidTypeAdd";

    }

    //删除付款方式
    @RequestMapping("/paidtypeDelete")
    public @ResponseBody int paidtypeDelete(int id) {
        System.out.println("删除付款方式：" + id);
        try {
            int k = paidtypeService.paidtypeDelete(id);

            System.out.println("k:" + k);
            return k;

        } catch (Exception e) {
            return 0;
        }

    }

    //修改信息
    @RequestMapping("/paidtypeUpdate")
    public String paidtypeUpdate(Paidtype paidtype,Model model){
        System.out.println("修改信息："+paidtype);
        int k=paidtypeService.paidtypeUpdate(paidtype);
        if (k>0){
            model.addAttribute("paidtypeUpdate","修改成功");
        }else {
            model.addAttribute("paidtypeUpdate","修改失败");
            //回显数据
            model.addAttribute("paid",paidtype);

        }
        return "view/paidTypeUpdate";
    }
}
