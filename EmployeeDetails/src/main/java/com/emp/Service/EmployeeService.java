package com.emp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.Model.Employee;
import com.emp.Repository.EmployeeRepository;
@Service
public class EmployeeService {
@Autowired
EmployeeRepository repo;
	public Employee addEmployee(Employee e) {
		// TODO Auto-generated method stub
		return repo.save(e);
	}
	public Employee findEmployeeById(int empId) {
		// TODO Auto-generated method stub
		return repo.findById(empId).get();
	}

	public void deleteEmployeeById(int empid)  {
		// TODO Auto-generated method stub
		/*
		 * Optional<Employee> emp=repo.deleteEmployeeById(empid); if(!emp.isPresent()) {
		 * throw new EmployeeIdNotFoundException("Employee id is not found"); } else {
		 * System.out.println("employee found"+empid); } return emp;
		 */
		repo.deleteById(empid);
}
	public Employee updateById(int empId, Employee emp) {
		// TODO Auto-generated method stub
		Employee d = repo.findById(empId).get();
		d.setFirstName(emp.getFirstName());
		d.setSecondName(emp.getSecondName());
		return repo.save(d);
	}
}
