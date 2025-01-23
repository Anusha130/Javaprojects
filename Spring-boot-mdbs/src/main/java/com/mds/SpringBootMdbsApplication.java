package com.mds;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mds.entity.Product;
import com.mds.productrepository.ProductDAO;

@SpringBootApplication
public class SpringBootMdbsApplication implements CommandLineRunner {

	@Autowired
	
	private ProductDAO productdao;

	public static void main(final String[] args) {
		SpringApplication.run(SpringBootMdbsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Product product = new Product(1,"lappi",2000000);  
		productdao.save(product);

	}

}
