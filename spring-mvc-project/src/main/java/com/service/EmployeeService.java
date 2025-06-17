package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Employee;
import com.dao.EmployeeDao;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeDao edao;
	
	public String createEmployee(Employee emp) {
		if(emp.getName().isBlank() || emp.getEmail().isBlank())
			return "Invalid Name and Email";
		else
			return edao.saveEmployee(emp);
	}
	
	public List<Employee> getAll() {
		return edao.allEmployee();
	}
}
