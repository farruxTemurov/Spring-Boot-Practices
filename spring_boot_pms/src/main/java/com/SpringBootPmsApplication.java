package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.bean")
public class SpringBootPmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPmsApplication.class, args);
		System.out.println("Spring boot's up!");
	}

}
