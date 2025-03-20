package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBasicRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBasicRestApiApplication.class, args);
		System.out.println("Spring Rest API");
	}

}
