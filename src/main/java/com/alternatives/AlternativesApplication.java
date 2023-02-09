package com.alternatives;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AlternativesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlternativesApplication.class, args);

	}
	@GetMapping("/")
	public String HelloTest() {
		return "Hello world";
	}

}
