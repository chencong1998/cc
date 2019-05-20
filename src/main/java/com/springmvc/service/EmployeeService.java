package com.springmvc.service;
//业务层
import java.util.*;
import com.springmvc.bean.Employee;
public interface EmployeeService {
    //查询所有的员工
    public List<Employee> getAllEmps();
    //删除员工
    public void deleteEmp(int id);
    //修改员工
    public void updateEmp(Employee emp);
    //添加员工
    public void addEmp(Employee emp);
    //按ID查询员工
    public Employee findByEmpId(int id);
}
