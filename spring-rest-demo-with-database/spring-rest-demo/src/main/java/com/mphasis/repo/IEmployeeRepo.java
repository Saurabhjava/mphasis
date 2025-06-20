package com.mphasis.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mphasis.bean.Employee;

//https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html

@Repository
public interface IEmployeeRepo extends JpaRepository<Employee, Integer> {
	public List<Employee> findByCity(String city);
	public List<Employee> findByEmail(String email);
	public List<Employee> findByNameAndEmail(String name, String email);
}
