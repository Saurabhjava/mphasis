package com.mphasis.api;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.mphasis.bean.Employee;
import com.mphasis.exception.EmployeeNotFoundException;
import com.mphasis.service.EmployeeService;

@RestController
@RequestMapping("employees")
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@GetMapping
	public List<Employee> getAllEmp() {
		return service.getAllEmployees();
	}
	
	@GetMapping("/{eid}")
	public Employee getEmpById(@PathVariable int eid) throws EmployeeNotFoundException {
		Employee e=service.getEmployee(eid);
		return e;
	}
	@GetMapping("/city/{city}")
	public List<Employee> getByCity(@PathVariable String city){
		return service.getAllEmployeesByCity(city);
	}
	@PostMapping
	public Employee createEmployee(@RequestBody Employee e) {
		return service.createEmployee(e);
	}
	
	@PutMapping
	public Employee updateEmployee(@RequestBody Employee e) throws EmployeeNotFoundException {
		return service.updateEmployee(e);
	}
	
	@DeleteMapping("/{eid}")
	public String delEmployee(@PathVariable int eid) throws EmployeeNotFoundException{
		return service.deleteEmployee(eid);
	}
}




