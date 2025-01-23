package com.javainspire.jdbctemplate.Service;

import java.util.List;

import com.javainspire.jdbctemplate.model.Employee;

public interface EmployeeService {
	public abstract void addEmployee(Employee employee);
	public abstract List<Employee> getAllEmployeesinfo();
}
