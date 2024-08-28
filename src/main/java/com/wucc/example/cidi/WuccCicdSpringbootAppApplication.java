package com.wucc.example.cidi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class WuccCicdSpringbootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(WuccCicdSpringbootAppApplication.class, args);
	}
	
	@GetMapping("/")
	public String home() {
		return "在 Spring Boot 应用程序上实现 CI/CD";
	}

}
