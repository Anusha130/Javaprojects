package com.cap.ServiceEurekhaDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;



@SpringBootApplication
@EnableEurekaServer
public class ServiceEurekhaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceEurekhaDemoApplication.class, args);
	}

}
