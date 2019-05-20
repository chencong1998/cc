package com.springmvc.controller;


import com.springmvc.bean.Orderstatus;
import com.springmvc.service.OrderstatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 订单状态控制层
 */
@Controller
@RequestMapping("/order")
public class OrderstatusController {


    @Autowired
    private OrderstatusService orderstatusService;


    //订单状态列表
   /* @RequestMapping("/orderPage")
    public @ResponseBody Map<String, Object> orderPage(int page,int limit){
        System.out.println("订单状态列表：page:"+page+" limit:"+limit);
        List<Orderstatus> list=orderstatusService.orderPage(page,limit); //查询显示信息
        System.out.println(list);

        List<Orderstatus> count = orderstatusService.orderAll(); //查询所有记录数
        System.out.println(count);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("msg", "");
        map.put("code", 0);
        map.put("count", count.size());
        map.put("data", list);
        return map;
    }*/

    //判断订单状态是否存在
    @RequestMapping("/orderName")
    public @ResponseBody int orderName(String ordername){
        System.out.println(ordername);
       Orderstatus order= orderstatusService.orderSelect(ordername);
       if (order!=null) //判断订单状态是否存在
           return 1;
       else
           return 0;
    }



    //添加订单状态
    @RequestMapping("/orderAdd")
    public String orderAdd(Orderstatus order,Model model){
        System.out.println("添加："+order);
        int k=orderstatusService.orderAdd(order);
        if (k>0) {
            model.addAttribute("orderAdd", "添加成功");
        }else {
            model.addAttribute("orderAdd","添加失败");
        }
        return "forward:/load/orderstsAdd";

    }

    //删除订单状态
    @RequestMapping("/orderDelete")
    public @ResponseBody int orderDelete(int id) {
        System.out.println("删除订单状态：" + id);
        try {
            int k = orderstatusService.orderDelete(id);

            System.out.println("k:" + k);
            return k;

        } catch (Exception e) {
            return 0;
        }

    }

    //修改信息
    @RequestMapping("/orderUpdate")
    public String orderUpdate(Orderstatus order,Model model){
        System.out.println("修改信息："+order);
        int k=orderstatusService.orderUpdate(order);
        if (k>0){
            model.addAttribute("orderUpdate","修改成功");
        }else {
            model.addAttribute("orderUpdate","修改失败");
            //回显数据
            model.addAttribute("orders",order);

        }
        return "view/orderstsUpdate";
    }
}
