package com.Stud.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Stud.Model.Department;
import com.Stud.Repository.DepartmentRepository;
@Service
public class DepartmentService {
	
  @Autowired
   DepartmentRepository repo;

	public Department addSubject(Department d) {
		// TODO Auto-generated method stub
		return repo.save(d);
	}

}
          