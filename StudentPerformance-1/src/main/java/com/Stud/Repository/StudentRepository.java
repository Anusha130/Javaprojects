package com.Stud.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Stud.Model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{

	
}
