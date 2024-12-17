package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorlController {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello, World!";
	}

	@GetMapping("/greet")
	public String greet() {
		return "Greetings from Spring Boot!";
	}

}