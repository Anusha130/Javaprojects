package com.capg.DemoEurekaClient.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.DemoEurekaClient.Model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{

	

}
