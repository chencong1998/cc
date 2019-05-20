package com.springmvc.mapper;
import com.springmvc.bean.Employee;
import java.util.*;
public interface EmployeeMapper {
    //按ID来查询员工
    public Employee getEmpById(int id);
    //查询所有员工
    public List<Employee> getAllEmps();
    //添加员工信息
    public void addEmp(Employee emp);
    //删除员工信息
    public void deleteEmp(int id);
    //修改员工信息
    public void updateEmp(Employee emp);

}

