package com.example.demo2.controller;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo2.model.PostRequestDto;
import com.example.demo2.model.PutRequestDto;

@RestController
@RequestMapping("/api")
public class PutApiController {
	
	// Method : PUT
	// http://localhost:8080/api/put1
	@PutMapping("/put1")
	public PostRequestDto put(@RequestBody PostRequestDto req) {
		System.out.println("req : " + req);
		return req;
	}
	
	// METHOD : PUT
	// http://localhost:8080/api/put2
	@PutMapping("/put2")
	public PutRequestDto put2(@RequestBody PutRequestDto req) {
		System.out.println("req" + req);
		return req;
	}
	
	
} // end of class
