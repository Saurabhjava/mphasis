package com.mphasis.repo;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.mphasis.bean.Employee;

@Repository
public class EmployeeRepo {
	private Set<Employee> emps;
	
	public EmployeeRepo() {
		emps=new HashSet<Employee>();
		emps.add(new Employee(1001, "Saurabh", "saurabh@gmail.com", LocalDate.of(1983, 2, 22), 15000));
		emps.add(new Employee(1002, "Saurabh1", "saurabh1@gmail.com", LocalDate.of(1984, 3, 22), 85000));
		emps.add(new Employee(1003, "Saurabh2", "saurabh2@gmail.com", LocalDate.of(1985, 4, 22), 95000));
		emps.add(new Employee(1004, "Saurabh3", "saurabh3@gmail.com", LocalDate.of(1986, 5, 22), 115000));
		emps.add(new Employee(1005, "Saurabh4", "saurabh4@gmail.com", LocalDate.of(1987, 12, 22), 65000));
	}
	
	public Set<Employee> getAll() {
		return emps;
	}
}
