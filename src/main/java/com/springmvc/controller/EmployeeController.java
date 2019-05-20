package com.springmvc.controller;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.bean.Employee;
import com.springmvc.service.EmployeeService;

//控制器类
@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	//显示所有员工信息
	@RequestMapping("/listAll")
	public String listAll(Map<String,Object> map){
		System.out.println("--listAll--");
		map.put("employees", employeeService.getAllEmps());
		return "list";
	}
	//添加员工信息
	@RequestMapping("/addEmp")
	public String addEmp(Employee emp){
		System.out.println("---add---");
		employeeService.addEmp(emp);
		return "redirect:listAll";
	}
	//删除员工信息
	@RequestMapping("/deleteEmp")
	public String deleteEmp(@RequestParam("id") int id){
		System.out.println("delete id="+ id);
		employeeService.deleteEmp(id);
		return "redirect:listAll";
	}
	//按ID查询用户
	@RequestMapping("/findByEmpId")
	public String findByEmpId(@RequestParam("id") int id,Map<String,Object> map){
		Employee emp=employeeService.findByEmpId(id);
		map.put("emp", emp);
		return "modify";
	}
	//修改用户
	@RequestMapping("/updateEmp")
	public String updateEmp(Employee emp){
		employeeService.updateEmp(emp);
		return "redirect:listAll";
	}
}
