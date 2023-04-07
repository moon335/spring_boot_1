package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor // 기본 생성자
@AllArgsConstructor // 모든 멤버 변수를 가지고 있는 생성자
public class PostReqDto {
	
	private String name;
	private String email;
	private int age;
	private int hobby;
	@JsonProperty("phone_number")
	private int phoneNumber;
	
} // end of class
