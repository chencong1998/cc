package com.springmvc.controller;

import com.springmvc.bean.Accmodule;
import com.springmvc.bean.Module;
import com.springmvc.bean.Users;
import com.springmvc.service.AccmoduleService;
import com.springmvc.service.ModuleService;
import com.springmvc.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户权限模块控制层
 */
@Controller
@RequestMapping("/accmodule")
public class AccmoduleController {
    @Autowired
    private AccmoduleService accmoduleService;
    @Autowired
    private UsersService usersService;
    @Autowired
    private ModuleService moduleService;
    @Autowired
    private HttpServletRequest request;

    //用户权限模块列表
    @RequestMapping("/accmoduleModify")
    public @ResponseBody
    List<Accmodule> accmoduleModify(int usersId) {
        System.out.println("用户权限模块列表：usersId:" + usersId);
        List<Accmodule> list = accmoduleService.accmoduleModify(usersId); //查询显示信息
        System.out.println(list);
        System.out.println(list.size());
        return list;
    }


    //添加用户权限模块
    @RequestMapping("/accmoduleAdd")
    public @ResponseBody
    int accmoduleAdd(String module, int userId) {
        System.out.println("添加：" + module + "  userId：" + userId);

        String[] moduleId = module.split(",");
        for (String m : moduleId
                ) {
            System.out.println(m);
        }

        //先删除用户所有权限
        accmoduleService.deleteByUsers(userId);
        //添加权限
        int k = accmoduleService.addAccmodule(moduleId, userId);
        System.out.println("k:" + k);
        return k;

    }

    //删除用户权限模块
    @RequestMapping("/accmoduleDelete")
    public @ResponseBody
    int accmoduleDelete(String module, int userId) {
        System.out.println("删除用户权限模块：" + userId + "  module:" + module);
        String[] moduleId = module.split(",");
        List<Integer> modules = new ArrayList<>();

        for (int i = 0; i < moduleId.length; i++) {
            modules.add(new Integer(moduleId[i]));
        }
        System.out.println(modules);
        try {
            int k = accmoduleService.deleteByIds(modules);

            System.out.println("k:" + k);
            return k;

        } catch (Exception e) {
            return 0;
        }

    }

    @RequestMapping("/acc")
    public String accModuleList() {
        System.out.println("加载权限设置");
        List<Users> listUsers = usersService.getAll();  //查询所有用户信息
        request.setAttribute("userList", listUsers);
        List<Module> listModule = moduleService.moduleAll(); // 查询所有权限
        request.setAttribute("Modules", listModule);
        return "accModuleList";
    }
}
