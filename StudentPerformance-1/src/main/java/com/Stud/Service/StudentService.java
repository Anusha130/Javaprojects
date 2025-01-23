package com.Stud.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Stud.Model.Student;
import com.Stud.Repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
    StudentRepository studentrepo;
	public Student addStudent(Student s)
	{
		return studentrepo.save(s);
	}

	public List<Student> allstudents() {
		// TODO Auto-generated method stub
		return studentrepo.findAll();
	}

	public Student addstudent(Student student) {
		// TODO Auto-generated method stub
		return studentrepo.save(student);
	}

}
