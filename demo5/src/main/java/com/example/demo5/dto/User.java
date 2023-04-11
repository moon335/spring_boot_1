package com.example.demo5.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
	
	private String name;
	@Min(1)
	@Max(100)
	private int age;
	@Email
	private String email;
	private String phoneNumber;
	
} // end of class
