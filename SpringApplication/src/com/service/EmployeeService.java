package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pojo.Employee;

@Component
public class EmployeeService {
	@Autowired
	private Employee emp;
	public void printEmployee() {
		System.out.println("Employee ID:"+emp.getEmpid());
		System.out.println("Employee Name:"+emp.getName());
		System.out.println("Employee Salary:"+emp.getSalary());
		System.out.println("Employee Geade:"+emp.getGrade());
		System.out.println("======Address Details====");
		System.out.println("City:"+emp.getAddress().getCity());
		System.out.println("Country:"+emp.getAddress().getCountry());
		System.out.println("Zip:"+emp.getAddress().getZip());
	}
	public void calculate(int a, int b) throws Exception {
		if(a==0 || b==0)
			throw new Exception();
		System.out.println(a/b);
	}
	
	public int add(int a, int b) {
		return a+b;
	}
}
