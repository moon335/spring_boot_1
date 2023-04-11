package com.example.demo51.dto;


import javax.validation.constraints.Email;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
	
	@NotEmpty
	private String name;
	@Min(10)
	private int age;
	@Email(message = "넌 이메일 형식도 모르니??")
	private String email;
	private String phoneNumber;
	
} // end of class
