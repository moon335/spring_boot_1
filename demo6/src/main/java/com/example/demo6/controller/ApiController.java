package com.example.demo6.controller;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo6.dto.User;

@RestController
@RequestMapping("/api")
@Validated // 하나씩 key=value 검사는 여기에 명시하기, 단, dto 방식은 예외
public class ApiController {
	
	// 유효성 검사 동작하게 코드 변경
	@GetMapping("/user")
	public User get(@Validated User user) {
		return user;
	}
	
	// 구분 : http body 데이터 전달 방식
	// 1. json 형식으로 넣어서 서버로 전달
	// 2. form 태그 활용해서 key=value 구조 (Query String)
	@PostMapping("/user")
	public User post(@Valid @RequestBody User user) {
		System.out.println(user);
		return user;
	}
	
	// 두번째 연습
	// application/x-www-form-urlencoded
	@GetMapping("/user2")
	public User get2(@Validated User reqUser) {
		return reqUser;
	}
	
	
} // end of class
