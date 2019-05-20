package com.springmvc.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springmvc.bean.*;
import com.springmvc.service.AreaService;
import com.springmvc.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author Mr Li
 * @create 2019
 */
@Controller
public class CarController {
    @Autowired
    private CarService carService;
    @Autowired
    private AreaService areaService;
    @Autowired
    private HttpServletRequest request;
    @RequestMapping("/car")
    @ResponseBody
    public Msg getEmpsWithJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        PageHelper.startPage(pn, 6);
        List<Car> customers=carService.getAllCar();
        PageInfo page = new PageInfo(customers, 5);
        return Msg.success().add("pageInfo",page);
    }
    @RequestMapping("/addCarDo")
    public String addCarDo(Car car) {
        int k=carService.addCar(car);
        String id1=String.valueOf(car.getCarid());
        if(k!=-1){
            request.setAttribute("message","汽车资料添加成功");
            request.setAttribute("urla","carlist1");
            request.setAttribute("op","5");
            request.setAttribute("id",id1);
            return "success";
        }
        return "error";
    }
    @RequestMapping("/addCar")
    public String addCar(Car car) {
        List<Area> areas=areaService.getAllArea();
        List<Customer> customers=carService.getAllCustomer();
        request.setAttribute("areas",areas);
        request.setAttribute("customer",customers);
        return "carAdd";
    }
    @RequestMapping("/getCar")
    public String getCar(@RequestParam(value = "id", required = false) Integer id) {
        Car car=carService.getCar(id);
        List<Area> areas=areaService.getAllArea();
        List<Customer> customers=carService.getAllCustomer();
        request.setAttribute("areas",areas);
        request.setAttribute("customer",customers);
        request.setAttribute("car",car);
        return "carUpdate";
    }
    @RequestMapping("/modifyCarDo")
    public String modifyCarDo(Car car) {
        int k=carService.modifyCarDo(car);
        PageHelper.startPage(1, 6);
        System.out.println("customer.getId():"+car.getCarid());
        List<Car> car1=carService.getAllSelectcar(car.getCarid());
        PageInfo page = new PageInfo(car1);
        String pn=String.valueOf(page.getPages());
        if(k!=-1){
            request.setAttribute("message","汽车资料修改成功");
            request.setAttribute("urla","carlist1");
            request.setAttribute("op","6");
            request.setAttribute("pn",pn);
            return "success";
        }
        return "error";
    }
    @ResponseBody
    @RequestMapping(value = "/delCar/{carid}",method = RequestMethod.DELETE)
    public Msg deleteUser(@PathVariable("carid") Integer carid){
        carService.delCar(carid);
        return Msg.success();
    }
}
