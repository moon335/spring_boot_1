package com.example.demo2.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api2")
public class DeleteApiController {
	
	// METHOD : delete
	// http://localhost:8080/api2/delete/{userId}
	// http://localhost:8080/api2/delete/{userId}?account=우리은행
	// http://localhost:8080/api2/delete/100?account=우리은행
	@DeleteMapping("/delete/{userId}")
	public void delete(@PathVariable String userId, @RequestParam String account) {
		System.out.println("userId : " + userId);
		System.out.println("account : " + account);
	}
	
	// 문제 Delete 주소 설계 및 응답 처리
	// path, query, path + query 둘 다 사용해보기
	@DeleteMapping("/delete2")
	public void delete2(@RequestParam Map<String, String> data) {
		
		data.entrySet().stream().forEach(d -> {
			System.out.println(d.getKey());
			System.out.println(d.getValue());
		});
	}
	
	@GetMapping("/get/{userId}")
	public void get(@PathVariable String userId, @RequestParam String account) {
		System.out.println("userId : " + userId);
		System.out.println("account : " + account);
	}
	
	
} // end of class
