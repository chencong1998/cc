package com.springmvc.controller;


import com.springmvc.bean.Balance;
import com.springmvc.bean.Customer;
import com.springmvc.bean.Paidtype;
import com.springmvc.service.AreaService;
import com.springmvc.service.BalanceService;
import com.springmvc.service.CustomerService;
import com.springmvc.service.PaidtypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

/**
 * 收付款控制层
 */
@Controller
@RequestMapping("/balance")
public class BalanceController {

   @Autowired
    private BalanceService balanceService;

    @Autowired
    private AreaService areaService;

    @Autowired
    private PaidtypeService paidtypeService;

    @Autowired
    private CustomerService customerService;

    /*//收付款列表
    @RequestMapping("/balancePage")
    public @ResponseBody Map<String, Object> balancePage(int page,int limit){
        System.out.println("收付款列表：page:"+page+" limit:"+limit);
        List<Balance> list=balanceService.balancePage(page,limit); //查询显示信息
        System.out.println(list);


        int count = balanceService.balanceAll(); //查询所有记录数
        System.out.println(count);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("msg", "");
        map.put("code", 0);
        map.put("count", count);
        map.put("data", list);
        return map;
    }*/

    /*//客户收付款列表
    @RequestMapping("/balanceCusPage")
    public @ResponseBody Map<String, Object> balanceCusPage(int customerId,int page,int limit){
        System.out.println("客户收付款列表：page:"+page+" limit:"+limit+"  customerId:"+customerId);
        List<Balance> list=balanceService.balanceByCus(customerId,page,limit); //查询显示信息
        System.out.println(list);

        int count = balanceService.balanceByCus(customerId); //查询所有记录数
        System.out.println(count);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("msg", "");
        map.put("code", 0);
        map.put("count", count);
        map.put("data", list);
        return map;
    }*/

    //客户往来查询
   /* @RequestMapping("/balanceModify")
    public @ResponseBody Map<String, Object> balanceModify(Balance balance, String customerName, int page,int limit){
        System.out.println("客户收付款列表：page:"+page+" limit:"+limit+"  customerName:"+customerName);
        List<Integer> listTransId = new ArrayList<>(); //存放查看客户的Id
        if (customerName!=""&&customerName!=null){
            List<Customer> listCus = customerService.customerByNames(customerName); //查询客户名称
            for (int i=0;i<listCus.size();i++){
                listTransId.add(listCus.get(i).getCustomerid()); //获取客户Id
            }
            if(listCus.size()==0){ //当需要查询客户名称的时候，没有该客户信息，则返回一个不存在的客户Id
                listTransId.add(0);
            }
        }

        //收付款类别
        if ("1".equals(balance.getPaidtype()))
            balance.setPaidtype("收款");
        if ("2".equals(balance.getPaidtype()))
            balance.setPaidtype("付款");

        //状态
        if ("1".equals(balance.getIsvalid()))
            balance.setIsvalid("有效");
        if ("2".equals(balance.getIsvalid()))
            balance.setIsvalid("作废");

        System.out.println(listTransId);
        System.out.println(balance);
        List<Balance> list=balanceService.balanceModify(balance,listTransId,page,limit); //查询显示信息
        System.out.println(list);

        int count = balanceService.balanceModify(balance,listTransId); //查询所有记录数
        System.out.println(count);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("msg", "");
        map.put("code", 0);
        map.put("count", count);
        map.put("data", list);
        return map;
    }*/


    //添加收付款
    /*@RequestMapping("/balanceAdd")
    public String balanceAdd(Balance balance, Model model){
        System.out.println("添加："+balance);
        balance.setOprtime(new Date());
        if("付款".equals(balance.getPaidtype())){
            balance.setFacefee(balance.getFacefee()*-1);
        }
        int k=balanceService.balanceAdd(balance);
        if (k>0) {
            model.addAttribute("balanceAdd", "添加成功");
        }else {
            model.addAttribute("balanceAdd","添加失败");
        }
        return "forward:/load/balanceAdd?id="+balance.getCustomer().getCustomerid();
    }*/

    //删除收付款
    @RequestMapping("/balanceDelete")
    public @ResponseBody int balanceDelete(int id){
        System.out.println("删除收付款："+id);
        int k=balanceService.balanceDeleteId(id);
        return k;
    }


    //修改收付款信息
    /*@RequestMapping("/balanceUpdate")
    public String balanceUpdate(Balance balance,Model model){
        System.out.println("修改信息："+balance);
        int k=balanceService.balanceUpdate(balance);
        if (k>0){
            model.addAttribute("balanceUpdate","修改成功");
        }else {
            model.addAttribute("balanceUpdate","修改失败");
            //回显数据
            model.addAttribute("user",balance);
            List<Area> listArea = areaService.areaAll();  //查询所有区域
            model.addAttribute("areas",listArea);
           *//* List<Balancetype> listBalancetype = balancetypeService.balancetypeAll();  //查询所有收付款类型
            model.addAttribute("custtypes",listBalancetype);*//*
            List<Paidtype> listPaidtype = paidtypeService.paidtypeAll();  //查询所有支付方式类型
            model.addAttribute("paidtypes",listPaidtype);
        }
        return "view/balanceUpdate";
    }*/

    //修改收付款信息是否有效
    @RequestMapping("/balanceUpdateIsvalid")
    public @ResponseBody int balanceUpdateIsvalid(int balanceId,String isvalid){
        System.out.println("修改信息："+balanceId+" iesvalid:"+isvalid);
        Balance balance = balanceService.balanceById(balanceId); //查询信息
        balance.setIsvalid(isvalid); //设置是否有效
        int k=balanceService.balanceUpdate(balance);
        return k;
    }
}
