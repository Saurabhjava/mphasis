package com.mphasis.api;

import java.time.LocalDate;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.bean.Employee;
import com.mphasis.repo.EmployeeService;

@RestController
@RequestMapping("employees")
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@GetMapping
	public Set<Employee> getAllEmp() {
		return service.getAllEmployees();
	}
	@GetMapping("/{eid}")
	public ResponseEntity<Employee> getEmpById(@PathVariable int eid) {
		Employee e=service.getEmployee(eid);
		if(e!=null)
			return new ResponseEntity<Employee>(e,HttpStatus.ACCEPTED);
		else
			return new ResponseEntity("Employee Not Found", HttpStatus.NOT_FOUND);
	}
	@PostMapping
	public Employee createEmployee(@RequestBody Employee e) {
		System.out.println("================"+e.getName());
		return service.createEmployee(e);
	}
}




