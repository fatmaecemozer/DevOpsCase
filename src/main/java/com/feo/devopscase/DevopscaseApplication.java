package com.feo.devopscase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DevopscaseApplication {

	@GetMapping("/hello")
	public String sayHello(){
		return "DevOps Case Hello Spring Boot";
	}
	public static void main(String[] args) {
		SpringApplication.run(DevopscaseApplication.class, args);
	}

}
