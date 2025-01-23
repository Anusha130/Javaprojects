package com.capg.DemoEurekaClient.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.DemoEurekaClient.Model.Student;
import com.capg.DemoEurekaClient.Repository.StudentRepository;


@Service
public class StudentService {

	//@Autowired
	StudentRepository repo;
	public Student addStudent(Student stu) {
		// TODO Auto-generated method stub
		return repo.save(stu);
	}
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		List<Student> students = repo.findAll();
		
		System.out.println("getting data fron db:" +students );

		return repo.findAll();
	}

}
