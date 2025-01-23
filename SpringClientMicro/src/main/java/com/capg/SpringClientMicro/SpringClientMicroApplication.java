package com.capg.SpringClientMicro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringClientMicroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringClientMicroApplication.class, args);
	}

}
