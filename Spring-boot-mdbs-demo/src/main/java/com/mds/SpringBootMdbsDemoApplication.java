package com.mds;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mds.entity.Product;
import com.mds.productrepository.ProductDAO;
import com.mds.productrepository.Student;

@SpringBootApplication
public class SpringBootMdbsDemoApplication implements CommandLineRunner
{

	@Autowired
	ProductDAO productdao;
	
	@Autowired
	Student student;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootMdbsDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Product product = new Product(2,"desktop",400000);
		productdao.save(product);
		
		System.out.println(student);
	}

}
