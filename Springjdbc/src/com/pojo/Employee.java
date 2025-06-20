package com.pojo;

public class Employee {
	private int empid;
	private String name;
	private String email;
	private int salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	
	}

	public Employee(int empid, String name, String email, int salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", email=" + email + ", salary=" + salary + "]";
	}
	
}
