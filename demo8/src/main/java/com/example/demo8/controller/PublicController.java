package com.example.demo8.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // IoC 대상
public class PublicController {
	
	// http://localhost:8080/hello
	@GetMapping("/hello")
	public String hello() {
		System.out.println("Controller에서 메서드 실행");
		return "hello";
	}
	
} // end of class
