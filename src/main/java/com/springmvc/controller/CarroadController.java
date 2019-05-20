package com.springmvc.controller;

import com.springmvc.bean.Area;
import com.springmvc.bean.Carroad;
import com.springmvc.bean.Customer;
import com.springmvc.service.AreaService;
import com.springmvc.service.CarroadService;
import com.springmvc.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 途径线路控制层
 */
@Controller
@RequestMapping("/carroad")
public class CarroadController {

   @Autowired
    private CarroadService carroadService;

    @Autowired
    private AreaService areaService;

    @Autowired
    private CustomerService customerService;

    //途径线路列表
    /*@RequestMapping("/carroadPage")
    public @ResponseBody Map<String, Object> carroadPage(int page,int limit){
        System.out.println("途径线路列表：page:"+page+" limit:"+limit);
        List<Carroad> list=carroadService.carroadPage(page,limit); //查询显示信息
        System.out.println(list);


        List<Carroad> count = carroadService.carroadAll(); //查询所有记录数
        System.out.println(count);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("msg", "");
        map.put("code", 0);
        map.put("count", count.size());
        map.put("data", list);
        return map;
    }*/

    //车辆途径线路列表
    /*@RequestMapping("/carroadTansPage")
    public @ResponseBody Map<String, Object> carroadTansPage(int transId,int page,int limit){
        System.out.println("车辆途径线路列表：page:"+page+" limit:"+limit+"  transId:"+transId);
        List<Carroad> list=carroadService.carroadByCus(transId,page,limit); //查询显示信息
        System.out.println(list);

        int count = carroadService.carroadByCus(transId); //查询所有记录数
        System.out.println(count);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("msg", "");
        map.put("code", 0);
        map.put("count", count);
        map.put("data", list);
        return map;
    }*/



    //添加途径线路
   /* @RequestMapping("/carroadAdd")
    public String carroadAdd(Carroad carroad, Model model){
        System.out.println("添加："+carroad);

        int k=carroadService.carroadAdd(carroad);
        if (k>0) {
            model.addAttribute("carroadAdd", "添加成功");
        }else {
            model.addAttribute("carroadAdd","添加失败");
        }
        return "forward:/load/carRoad?transId="+carroad.getTranscar().getTransid();
    }

    //删除途径线路
    @RequestMapping("/carroadDelete")
    public @ResponseBody int carroadDelete(int id){
        System.out.println("删除途径线路："+id);
        int k=carroadService.carroadDeleteId(id);
        return k;
    }*/


    //修改途径线路信息
    /*@RequestMapping("/carroadUpdate")
    public String carroadUpdate(Carroad carroad,Model model){
        System.out.println("修改信息："+carroad);
        int k=carroadService.carroadUpdate(carroad);
        if (k>0){
            model.addAttribute("carroadUpdate","修改成功");
        }else {
            model.addAttribute("carroadUpdate","修改失败");
            //回显数据
            model.addAttribute("user",carroad);
            List<Area> listArea = areaService.areaAll();  //查询所有区域
            model.addAttribute("areas",listArea);
            List<Customer> listCustomer = customerService.customerAll();  //查询所有客户类型
            model.addAttribute("custs",listCustomer);
        }
        return "view/carroadUpdate";
    }*/


}
