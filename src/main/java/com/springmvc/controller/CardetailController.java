package com.springmvc.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springmvc.bean.*;
import com.springmvc.service.AreaService;
import com.springmvc.service.CarService;
import com.springmvc.service.CardetailService;
import com.springmvc.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author Mr Li
 * @create 2019
 */
@Controller
public class CardetailController {
    @Autowired
    private CardetailService cardetailService;
    @Autowired
    private AreaService areaService;
    @Autowired
    private CarService carService;
    @Autowired
    private CustomerService customerService;
    @Autowired
    private HttpServletRequest request;

    @RequestMapping("/carde")
    @ResponseBody
    public Msg getEmpsWithJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        PageHelper.startPage(pn, 6);
        List<Cardetail> cardetails = cardetailService.getAllcardetail();
        PageInfo page = new PageInfo(cardetails, 5);
        return Msg.success().add("pageInfo", page);
    }

    @RequestMapping("/detailss")
    @ResponseBody
    public Msg getdetailssWithJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
                                   @RequestParam(value = "i0", required = false ) String i0,
                                   @RequestParam(value = "i1", required = false) String i1,
                                   @RequestParam(value = "i2", required = false) String i2,
                                   @RequestParam(value = "i3", required = false) String i3,
                                   @RequestParam(value = "i4", required = false) String i4,
                                   @RequestParam(value = "i5", required = false) String i5,
                                   @RequestParam(value = "i6", required = false) String i6) {
        String statu=new String();
        if("1".equals(i1)){
            statu="已到站";
        }else if("2".equals(i1)){
            statu="未发货";
        }else if("3".equals(i1)){
            statu="已发货";
        }else{
            statu=null;
        }
        if(i0==null||i0==""){
            i0=null;
        }
        if("0".equals(i2)||i2==""){
            i2=null;
        }
        if("0".equals(i3)||i3==""){
            i3=null;
        }
        if("0".equals(i4)||i4==""){
            i4=null;
        }
        if("0".equals(i5)||i5==""){
            i5=null;
        }
        if("0".equals(i6)||i6==""){
            i6=null;
        }
        System.out.println("i0:"+i0);
        System.out.println("i1:"+i1);
        System.out.println("i2:"+i2);
        System.out.println("i3:"+i3);
        System.out.println("i4:"+i4);
        System.out.println("i5:"+i5);
        System.out.println("i6:"+i6);
        System.out.println("statu:"+statu);
        PageHelper.startPage(pn, 1);
        List<Cardetail> cardetails = cardetailService.selectByExampleWithother1(statu,i0,i2,i3,i4,i5,i6);
        PageInfo page = new PageInfo(cardetails, 5);
        System.out.println("page:"+page);
        return Msg.success().add("pageInfo", page);
    }
    @RequestMapping("/selectOrd")
    public String selectOrd() {
        List<Car> cars = carService.getAllCar();
        List<Area> areas = areaService.getAllArea();
        List<Customer> customers = customerService.getAllCustomer1();
        request.setAttribute("cars", cars);
        request.setAttribute("areas", areas);
        request.setAttribute("cus", customers);
        return "CarDetailRep";
    }

    @RequestMapping(value = "/selectbyif", method = RequestMethod.POST)
    public String selectbyif(@RequestParam(value = "detailid", required = false) String detailid,
                             @RequestParam(value = "orderid", required = false) String orderid,
                             @RequestParam(value = "transID", required = false) String transID,
                             @RequestParam(value = "sendCustID", required = false) String sendCustID,
                             @RequestParam(value = "sendCity", required = false) String sendCity,
                             @RequestParam(value = "receCustID", required = false) String receCustID,
                             @RequestParam(value = "receCity", required = false) String receCity) {
        HttpSession session = request.getSession();
        request.setAttribute("detailid", detailid);
        request.setAttribute("orderid", orderid);
        request.setAttribute("transID", transID);
        request.setAttribute("sendCustID", sendCustID);
        request.setAttribute("sendCity", sendCity);
        request.setAttribute("receCustID", receCustID);
        request.setAttribute("receCity", receCity);
        return "CarDetailStatuslist";
    }
}
