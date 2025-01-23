package com.emp.Controller;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.Model.Employee;
import com.emp.Service.EmployeeService;
@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	 private EmployeeService service;

	    // Constructor Injection
	    public void EmployeeService(EmployeeService service) {
	        this.service = service;
	    }

	@PostMapping("/addEmployee")
	public ResponseEntity<String> addEmployee(@RequestBody Employee e){
	 service.addEmployee(e);
		return new ResponseEntity<>("Record inserted Successfully",HttpStatus.OK);
	}
	@GetMapping("/findById/{empId}")
	public ResponseEntity<Employee> allEmployees(@PathVariable int empId){
	   Employee obj = service.findEmployeeById(empId);
		//System.out.println(obj);
		return new ResponseEntity<>(obj,HttpStatus.OK);

	}
	@DeleteMapping("/deleteById/{empId}")
	public void deleteEmployeeById(@PathVariable int empid) {
	service.deleteEmployeeById(empid);

	}
		@PutMapping("updateById/{empId}")
		public Employee updateById(@PathVariable int empId,@RequestBody Employee emp) {
			return service.updateById(empId,emp);
		}

}
