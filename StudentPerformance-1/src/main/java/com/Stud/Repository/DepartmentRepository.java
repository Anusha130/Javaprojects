package com.Stud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Stud.Model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer>{ 

	
}
