package com.springmvc.controller;


import com.springmvc.bean.Area;
import com.springmvc.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

//首页
@Controller
public class IndexController {
    //进入到系统首页
    @Autowired
    private HttpServletRequest request;
    @Autowired
    private AreaService areaService;
    @RequestMapping("/pagesIndex")
    public String index(){
        return "index";
    }
    //首页的验证码显示出来
   /* @RequestMapping("/code")
    public String code(){
        System.out.println("---dlimage测试----");
        return "yz";
    }*/

    @RequestMapping("/left")
    public String leftiframe(){
        return "left1";
    }
    @RequestMapping("/right")
    public String rightiframe(){
        return "right";
    }

    @RequestMapping("/addUser")
    public String addUser(){
        List<Area> areas=areaService.getAllArea();
        request.setAttribute("areas",areas);
        return "userAdd";
    }
    @RequestMapping("/listUser")
    public String listUser(@RequestParam(value = "nb",required = false) String nb){
        System.out.println("id:"+nb);
        HttpSession session=request.getSession();
        String op=(String)session.getAttribute("op");
        session.removeAttribute("op");
        System.out.println("op:"+op);
        if("1".equals(op)){
            request.setAttribute("pn", "");
            request.setAttribute("id", nb);
        }else if("2".equals(op)){
            request.setAttribute("pn", nb);
            request.setAttribute("id", "");
        }
        return "userlist1";
    }
    @RequestMapping("/customerlist1")
    public String customerlist(@RequestParam(value = "nb",required = false) String nb){
        System.out.println("id:"+nb);
        HttpSession session=request.getSession();
        String op=(String)session.getAttribute("op");
        session.removeAttribute("op");
        System.out.println("op:"+op);
        if("4".equals(op)){
            request.setAttribute("pn", "");
            request.setAttribute("id", nb);
        }else if("3".equals(op)){
            request.setAttribute("pn", nb);
            request.setAttribute("id", "");
        }
        return "customerlist";
    }
    @RequestMapping("/carlist1")
    public String carlist1(@RequestParam(value = "nb",required = false) String nb){
        System.out.println("id:"+nb);
        HttpSession session=request.getSession();
        String op=(String)session.getAttribute("op");
        session.removeAttribute("op");
        System.out.println("op:"+op);
        if("5".equals(op)){
            request.setAttribute("pn", "");
            request.setAttribute("id", nb);
        }else if("6".equals(op)){
            request.setAttribute("pn", nb);
            request.setAttribute("id", "");
        }
        return "carlist";
    }
    @RequestMapping("/getUNAndP")
    public String getUNAndP(){
        return "modifypwd";
    }
    @RequestMapping("/customerlist")
    public String customerlist(){
        return "customerlist";
    }
    @RequestMapping("/balance")
    public String balance(@RequestParam(value = "cusid",required = false) String cusid){
        request.setAttribute("cusid",cusid);
        return "balancelist";
    }
    @RequestMapping("/cardebycid")
    public String cardebycid(@RequestParam(value = "cusid",required = false) String cusid){
        request.setAttribute("cusid",cusid);
        return "CarDetailbyCustomerIDlist";
    }
    @RequestMapping("/carlist")
    public String carlist(){
        return "carlist";
    }
}
