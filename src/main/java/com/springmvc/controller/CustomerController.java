package com.springmvc.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springmvc.bean.*;
import com.springmvc.service.AreaService;
import com.springmvc.service.CustomerService;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author Mr Li
 * @create 2019
 */
@Controller
public class CustomerController {
    @Autowired CustomerService customerService;
    @Autowired AreaService areaService;
    @Autowired private HttpServletRequest request;
    @RequestMapping("/customer")
    @ResponseBody
    public Msg getEmpsWithJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        PageHelper.startPage(pn, 6);
        List<Customer> customers=customerService.getAllCustomer();
        PageInfo page = new PageInfo(customers, 5);
        return Msg.success().add("pageInfo",page);
    }
    @RequestMapping("/balance1")
    @ResponseBody
    public Msg getBlance(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
                         @RequestParam(value = "cusid",required = false) Integer cusid) {
        System.out.println("ersgege");
        PageHelper.startPage(pn, 6);
        List<Balance> balances=customerService.getAllbalance(cusid);
        PageInfo page = new PageInfo(balances, 5);
        return Msg.success().add("pageInfo",page);
    }
    @RequestMapping("/cardebycid1")
    @ResponseBody
    public Msg getCardebycid1(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
                         @RequestParam(value = "cusid",required = false) Integer cusid) {
        PageHelper.startPage(pn, 6);
        List<Cardetail> cardetails=customerService.getAllCardetail(cusid);
        PageInfo page = new PageInfo(cardetails, 5);
        return Msg.success().add("pageInfo",page);
    }
    @RequestMapping("/getpaymon")
    public String getpaymon(@RequestParam(value = "id",required = false) Integer id) {
        Customer customer=customerService.getOneCus(id);
        request.setAttribute("cus",customer);
        return "balanceAdd";
    }
    @RequestMapping(value = "/addbana",method = RequestMethod.POST)
    public String addbana(@RequestParam(value = "userid",required = false) Integer userid,
                          Balance balance) {
        BigDecimal facefee=balance.getFacefee();
        int f=facefee.intValue();
        if("付款".equals(balance.getPaidtype())){
            f=f*(-1);
            facefee=BigDecimal.valueOf((int)f);
        }
        balance.setFacefee(facefee);
        balance.setUserid(userid);
        balance.setIsvalid("有效");
        int k=customerService.addbana(balance);
        if(k!=-1){
            return "customerlist";
        }else{
            return "error";
        }
    }
    @ResponseBody
    @RequestMapping(value = "/zuoFei/{id}",method = RequestMethod.POST)
    public Msg modUserstau(@PathVariable("id") Integer id){
        Balance balance=new Balance();
        balance.setBalanceid(id);
        balance.setIsvalid("作废");
        int i=customerService.zuoFei(balance);
        return Msg.success();
    }
    @RequestMapping("/getcus")
    public String getcus(@RequestParam(value = "cusid",required = false) Integer cusid) {
        Customer customer=customerService.getOneCus(cusid);
        List<Area> areas=areaService.getAllArea();
        List<Paidtype> paidtypes=customerService.getAllPaidType();
        List<Customertype> customertypes=customerService.getAllCustomerType();
        request.setAttribute("cust",customer);
        request.setAttribute("areas",areas);
        request.setAttribute("paidtypes",paidtypes);
        request.setAttribute("custtypes",customertypes);
        return "customerUpdate";
    }
    @RequestMapping("/modifyCus")
    public String modifyCus(Customer customer) {
        int k=customerService.modifyCus(customer);
        PageHelper.startPage(1, 6);
        System.out.println("customer.getId():"+customer.getCustomerid());
        List<Customer> customers=customerService.getAllSelectcus(customer.getCustomerid());
        PageInfo page = new PageInfo(customers);
        System.out.println("page.getPages():"+page.getPages());
        String pn=String.valueOf(page.getPages());
        if(k!=-1){
            request.setAttribute("message","客户修改成功");
            request.setAttribute("urla","customerlist1");
            request.setAttribute("op","3");
            request.setAttribute("pn",pn);
            return "success";
        }
        return "error";
    }
    @ResponseBody
    @RequestMapping(value = "/delCus/{cid}",method = RequestMethod.DELETE)
    public Msg deleteUser(@PathVariable("cid") Integer cid){
        customerService.delCus(cid);
        return Msg.success();
    }
    @RequestMapping("/addCus")
    public String addCus() {
        List<Area> areas=areaService.getAllArea();
        List<Paidtype> paidtypes=customerService.getAllPaidType();
        List<Customertype> customertypes=customerService.getAllCustomerType();
        request.setAttribute("areas",areas);
        request.setAttribute("paidtypes",paidtypes);
        request.setAttribute("custtypes",customertypes);
        return "customerAdd";
    }
    @RequestMapping("/addCusDo")
    public String addCusDo(Customer customer) {
        int k=customerService.addCusDo(customer);
        String id1=String.valueOf(customer.getCustomerid());
        System.out.println("users.getId():"+id1);
        if(k!=-1){
            request.setAttribute("message","客户添加成功");
            request.setAttribute("urla","customerlist1");
            request.setAttribute("op","4");
            request.setAttribute("id",id1);
            return "success";
        }
        return "error";
    }

}
