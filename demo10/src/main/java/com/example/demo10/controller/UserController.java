package com.example.demo10.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
	
	@GetMapping("/loginPage")
	public String loginPage() {
		
		
		return "login.html"; // 내부에서 이동
	}
	
	/*
	 * 인증된 사용자만 들어올 수 있게 막을 예정
	 * AuthInterceptor 동작 시키려면 주소 설계를 /auth/**으로 만들어야함
	 */
	@GetMapping("/auth/infoPage")
	public String infoPage(HttpServletRequest request) {
		// 테스트
//		HttpSession session = request.getSession();
//		Object principal = session.getAttribute("principal");
//		if(principal == null) {
//			return "redirect:/loginPage";
//		}
		System.out.println("여기 코드 실행 하려면 로그인 되야 함");
		// 상대위치 -> 현재 그 시점에서 맞게 설계를 해야함
		// 위치에서 상대경로로 찾을지 절대 경로로 찾을지 결정
		// 상대경로인 info.html로 하면 안되는 이유가 지금 mapping된 시점이
		// /auth/infoPage이기 때문에 auth라는 폴더 안에 있다고 인식해서
		// 상대경로로 찾을 시 404오류가 발생
		// auth 폴더를 만들어서 info.html을 넣어주는 해결방법과 절대경로를
		// 사용하는 해결방법이 있음
		return "/info.html";
	}
	
	@PostMapping("/loginProc")
	public String loginProc(HttpServletRequest request, HttpServletResponse response) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		HttpSession session = request.getSession();
		session.setAttribute("principal", username);
		return "redirect:/auth/infoPage";
	}
	
} // end of class
