package com.dao;

import java.util.List;

import com.pojo.Employee;

public interface IEmployeeDao {
	public int saveEmployee(Employee e);
	public Employee getEmployee(int eid);
	public List<Employee> getAll();
}
