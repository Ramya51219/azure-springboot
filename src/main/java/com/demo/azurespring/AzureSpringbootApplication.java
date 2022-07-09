package com.demo.azurespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureSpringbootApplication {
	
	@GetMapping("/suprise")
	public String suprise() {
		return "Iam Suprised";
	}

	public static void main(String[] args) {
		SpringApplication.run(AzureSpringbootApplication.class, args);
	}

}
