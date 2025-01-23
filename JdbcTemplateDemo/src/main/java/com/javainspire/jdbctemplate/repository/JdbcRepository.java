package com.javainspire.jdbctemplate.repository;

import java.util.List;

import com.javainspire.jdbctemplate.model.Employee;

public interface JdbcRepository {
	public abstract void addEmployee(Employee employee);
	public abstract List<Employee> getAllEmployeesinfo();
	
}

