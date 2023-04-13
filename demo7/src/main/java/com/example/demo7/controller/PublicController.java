package com.example.demo7.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicController {
	
	@GetMapping("/hello")
	public String hello() {
		System.out.println("controller 들어옴");
		return "hello";
	}
	
	
} // end of class
