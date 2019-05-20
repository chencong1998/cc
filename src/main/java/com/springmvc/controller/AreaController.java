package com.springmvc.controller;

import com.springmvc.bean.Area;
import com.springmvc.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 区域控制层
 */
@Controller
@RequestMapping("/area")
public class AreaController {


    @Autowired
    private AreaService areaService;


    //区域列表
   /* @RequestMapping("/areaPage")
    public @ResponseBody Map<String, Object> areaPage(int page,int limit){
        System.out.println("区域列表：page:"+page+" limit:"+limit);
        List<Area> list=areaService.areaPage(page,limit); //查询显示信息
        System.out.println(list);

        List<Area> count = areaService.areaAll(); //查询所有记录数
        System.out.println(count);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("msg", "");
        map.put("code", 0);
        map.put("count", count.size());
        map.put("data", list);
        return map;
    }*/

   /* //判断区域是否存在
    @RequestMapping("/areaName")
    public @ResponseBody int areaName(String areaname){
        System.out.println(areaname);
       Area area= areaService.areaSelect(areaname);
       if (area!=null) //判断区域是否存在
           return 1;
       else
           return 0;
    }*/



   /* //添加区域
    @RequestMapping("/areaAdd")
    public String areaAdd(Area area, Model model){
        System.out.println("添加："+area);
        int k=areaService.areaAdd(area);
        if (k>0) {
            model.addAttribute("areaAdd", "添加成功");
        }else {
            model.addAttribute("areaAdd","添加失败");
        }
        return "forward:/load/areaAdd";

    }*/

   /* //删除区域
    @RequestMapping("/areaDelete")
    public @ResponseBody int areaDelete(int id) {
        System.out.println("删除区域：" + id);
        try {
            int k = areaService.areaDelete(id);

            System.out.println("k:" + k);
            return k;

        } catch (Exception e) {
            return 0;
        }

    }*/

    /*//修改信息
    @RequestMapping("/areaUpdate")
    public String areaUpdate(Area area,Model model){
        System.out.println("修改信息："+area);
        int k=areaService.areaUpdate(area);
        if (k>0){
            model.addAttribute("areaUpdate","修改成功");
        }else {
            model.addAttribute("areaUpdate","修改失败");
            //回显数据
            model.addAttribute("area",area);

        }
        return "view/areaUpdate";
    }*/
}
