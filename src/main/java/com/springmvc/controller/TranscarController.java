package com.springmvc.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springmvc.bean.*;
import com.springmvc.service.AreaService;
import com.springmvc.service.CarService;
import com.springmvc.service.TranscarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Mr Li
 * @create 2019
 */
@Controller
public class TranscarController {
    @Autowired
    private TranscarService transcarService;
    @Autowired
    private AreaService areaService;
    @Autowired
    private HttpServletRequest request;
    @RequestMapping("/tran")
    @ResponseBody
    public Msg getTranWithJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        PageHelper.startPage(pn, 6);
        List<Transcar> transcars=transcarService.getAlltranscar();
        PageInfo page = new PageInfo(transcars, 5);
        return Msg.success().add("pageInfo",page);
    }
    @RequestMapping("/transCarlist")
    public String transCarlist(){
        return "transCarlist";
    }
    @RequestMapping("/getCarroad")
    public String getCarroad(@RequestParam(value = "id",required = false) int id){
        Transcar transcar=transcarService.getOnetran(id);
        List<Area> areas=areaService.getAllArea();
        request.setAttribute("transcar",transcar);
        request.setAttribute("areas",areas);
        return "carRoad";
    }
    @RequestMapping("/addCarRoad")
    public String addCarRoad(Carroad carroad){
        transcarService.addCarRoad(carroad);
        return "transCarlist";
    }
    @RequestMapping("/getTran")
    public String getTran(@RequestParam(value = "id",required = false) int id){
        Transcar transcar=transcarService.getOnetran(id);
        List<Area> areas=areaService.getAllArea();
        List<Car> cars=transcarService.getAllCar();
        List<Sendtype> sendtypes=transcarService.getAllsendtype();
        request.setAttribute("transcar",transcar);
        request.setAttribute("areas",areas);
        request.setAttribute("sendtypes",sendtypes);
        request.setAttribute("cars",cars);
        return "transCarUpdate";
    }
    @RequestMapping("/modifyTran")
    public String addTran(Transcar transcar){
        transcarService.addTran(transcar);
        return "transCarlist";
    }
    @ResponseBody
    @RequestMapping(value = "/deltran/{transid}",method = RequestMethod.DELETE)
    public Msg deleteUser(@PathVariable("transid") Integer transid){
        transcarService.deltran(transid);
        return Msg.success();
    }
}
