package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.pojo.Employee;

public class EmployeeDao implements IEmployeeDao {
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int saveEmployee(Employee e) {
		String qry="insert into employee values(?,?,?,?)";
		int rows=jdbcTemplate.update(qry, e.getEmpid(),e.getName(),e.getEmail(),e.getSalary());
		return rows;
	}

	@Override
	public Employee getEmployee(int eid) {
		String qry="select * from employee where empid=?";
		List<Employee> e=jdbcTemplate.query(qry,new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee emp=new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
				return emp;
			}
			
		},eid);
		if(e.size()>0)
			return e.get(0);
		else
			return null;
	}

	@Override
	public List<Employee> getAll() {
		String qry="select * from employee";
		List<Employee> e=jdbcTemplate.query(qry,new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee emp=new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
				return emp;
			}
			
		});
		return e;
	}

}
