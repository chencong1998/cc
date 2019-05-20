package com.springmvc.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springmvc.bean.Employee;
import com.springmvc.mapper.EmployeeMapper;
import com.springmvc.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeMapper employeeMapper;

	@Override
	public List<Employee> getAllEmps() {
		return employeeMapper.getAllEmps();
	}

	@Override
	public void deleteEmp(int id) {
		employeeMapper.deleteEmp(id);
	}

	@Override
	public void updateEmp(Employee emp) {
		employeeMapper.updateEmp(emp);
	}

	@Override
	public void addEmp(Employee emp) {
		employeeMapper.addEmp(emp);
	}

	@Override
	public Employee findByEmpId(int id) {
		return employeeMapper.getEmpById(id);
	}

}
