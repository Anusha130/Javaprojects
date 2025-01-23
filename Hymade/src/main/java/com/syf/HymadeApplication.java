package com.syf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories(basePackages = "com.syf.repository")
public class HymadeApplication {

	public static void main(String[] args) {
		SpringApplication.run(HymadeApplication.class, args);
	}

}
