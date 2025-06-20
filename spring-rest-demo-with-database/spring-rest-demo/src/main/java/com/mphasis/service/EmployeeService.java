package com.mphasis.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.bean.Employee;
import com.mphasis.exception.EmployeeNotFoundException;
import com.mphasis.repo.IEmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private IEmployeeRepo erepo;

	public List<Employee> getAllEmployees() {
		return erepo.findAll();
	}
	public List<Employee> getAllEmployeesByCity(String city) {
		return erepo.findByCity(city);
	}

	public Employee getEmployee(int empid) throws EmployeeNotFoundException {
		Optional<Employee> op = erepo.findById(empid);
		if (op.isPresent())
			return op.get();
		else
			throw new EmployeeNotFoundException("Employee Not Found");
	}

	public Employee createEmployee(Employee e) {
		Employee emp = erepo.saveAndFlush(e);
		return emp;
	}

	public Employee updateEmployee(Employee e) throws EmployeeNotFoundException {
		if (getEmployee(e.getEmpid()) != null)
			return erepo.saveAndFlush(e);
		else
			return null;
	}

	public String deleteEmployee(int empid) throws EmployeeNotFoundException {
		if (getEmployee(empid) != null) {
			erepo.deleteById(empid);
			return "Employee Deleted...";
		} else {
			return "Employee not found";
		}
	}
}
