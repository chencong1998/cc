package com.springmvc.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springmvc.bean.Area;
import com.springmvc.bean.Employee;
import com.springmvc.bean.Msg;
import com.springmvc.bean.Users;
import com.springmvc.service.AreaService;
import com.springmvc.service.UsersService;
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
public class UsersController {
    @Autowired
    private UsersService usersService;
    @Autowired
    private AreaService areaService;
    @Autowired
    private HttpServletRequest request;
    @RequestMapping(value = "/UserServlet",method = RequestMethod.POST)
    public String userLogin(@RequestParam(value = "action",required = false) String action,
                            Users users) throws Exception{
        System.out.println("action:"+action);
        HttpSession session=request.getSession();
        if("login".equals(action)){
            Users users1=usersService.login(users);
            if(users1.getUsername()!=null){
                System.out.println(users1);
                System.out.println(users1.getDepname());
                //users1.setDepname(users1.getDepname());
                session.setAttribute("users",users1);
                return "main";
            }else{
                System.out.println("sef");
                request.setAttribute("errorinfo","用户名或密码错误");
                return "index";
            }
        }
        return "error";
    }
    @ResponseBody//返回json格式数据
    @RequestMapping(value = "/checkUser",method = RequestMethod.POST)
    public Msg checkUser(String username){
        boolean b=usersService.checkUser(username);
        if(b){
            return Msg.success().add("va_msg","用户名可用");
        }else{
            return Msg.fail().add("va_msg","用户名已存在");
        }
    }
    @ResponseBody//返回json格式数据
    @RequestMapping(value = "/checkUseraa",method = RequestMethod.POST)
    public Msg checkUser1(String username){
        List<Users> user=usersService.checkUser1(username);
        if(user.size()>0){
            return Msg.fail().add("nameyz",user.get(0).getUsername());
        }else{
            return Msg.success().add("va_msg","用户名可用");
        }
    }
    @RequestMapping(value = "/addUserDo",method = RequestMethod.POST)
    public String addUser(Users users){
        int k=usersService.addUser(users);
        String id1=String.valueOf(users.getId());
        System.out.println("users.getId():"+users.getId());
        if(k!=-1){
            request.setAttribute("message","用户添加成功");
            request.setAttribute("urla","listUser");
            request.setAttribute("op","1");
            request.setAttribute("id",id1);
            return "success";
        }else{
            return "error";
        }
    }

    @RequestMapping("/users")
    @ResponseBody
    public Msg getEmpsWithJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        // 这不是一个分页查询
        // 引入PageHelper分页插件
        // 在查询之前只需要调用,传入页码，以及每页的记录数
        PageHelper.startPage(pn, 6);
        // startPage后面紧的这个查询就是一个分页查询
        List<Users> users=usersService.getAll();
        // 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了
        // 封装了详细的分页信息。包括有我们查出来的数据，传入连接显示的页数
        PageInfo page = new PageInfo(users, 5);
        return Msg.success().add("pageInfo",page);
    }
    @RequestMapping(value = "/userInfo/{id}", method = RequestMethod.GET)
    public String userChange(@PathVariable("id") Integer id){
        Users user=usersService.getUser(id);
        List<Area> areas=areaService.getAllArea();
        request.setAttribute("areas",areas);
        request.setAttribute("user",user);
        return "userUpdate";
    }
    @RequestMapping(value = "/modifyUser",method = RequestMethod.POST)
    public String modifyUser(Users users){
        int i=usersService.changeUser(users);
        PageHelper.startPage(1, 6);
        System.out.println("users.getId():"+users.getId());
        List<Users> users1=usersService.getAllSelect(users.getId());
        PageInfo page = new PageInfo(users1);
        System.out.println(i);
        System.out.println("page.getPages():"+page.getPages());
        String pn=String.valueOf(page.getPages());
        if(i!=-1){
            request.setAttribute("message","用户修改成功");
            request.setAttribute("urla","listUser");
            request.setAttribute("op","2");
            request.setAttribute("pn",pn);
            return "success";
        }else{
            return "error";
        }
    }
    @ResponseBody
    @RequestMapping(value = "/delUser/{id}",method = RequestMethod.DELETE)
    public Msg deleteUser(@PathVariable("id") Integer id){
        usersService.deleteUser(id);
        return Msg.success();
    }
    @ResponseBody
    @RequestMapping(value = "/modUserstau/{id}",method = RequestMethod.POST)
    public Msg modUserstau(@PathVariable("id") Integer id){
        Users users=new Users();
        users.setId(id);
        users.setStaus(0);
        usersService.modUserstau(users);
        return Msg.success();
    }
    @RequestMapping(value = "/modifyuserpwd",method = RequestMethod.POST)
    public String modifyuserpwd(@RequestParam(value = "oldpwd",required = false) String oldpwd,
                                Users users){
        System.out.println("users.getId():"+users.getId());
        Users users1=usersService.getUser(users.getId());
        if(users1.getPassword().equals(oldpwd)){
            int i=usersService.changeUser(users);
            request.setAttribute("ret","succ");
            return "modifypwd";
        }else{
            request.setAttribute("ret","failed");
            return "modifypwd";
        }
    }

}