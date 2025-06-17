package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bean.Employee;
import com.service.EmployeeService;

@Controller
public class HelloController {
	
	@Autowired
	private EmployeeService eService;
	
	@GetMapping("hello")
	public String sayHello(Model m, Employee emp) {
		String res=eService.createEmployee(emp);
		m.addAttribute("response", res);
		return "addEmployee";
	}

	@GetMapping("add")
	public String sayHello1() {
		return "addEmployee";
	}
	
	@GetMapping("all")
	public String sayHello3(Model m) {
		List<Employee> li=eService.getAll();
		m.addAttribute("emps", li);
		return "result";
	}
	
	/*
	 * @GetMapping("hello") public String sayHello(Model m, @RequestParam("t1")
	 * String eid, @RequestParam("t2") String name,
	 * 
	 * @RequestParam("t3") String email, @RequestParam("cb") String dept) { Employee
	 * emp=new Employee(Integer.parseInt(eid), name, dept, email);
	 * m.addAttribute("employee", emp); return "employee"; }
	 */
}
