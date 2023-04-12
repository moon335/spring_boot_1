package com.example.demo6.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

// 인터페이스 구현 선언
@Slf4j
@Component // 클래스 하나를 BEAN 객체로 만들때
public class GlobalFilter implements Filter{
	
//	@Override
//	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
//			throws IOException, ServletException {
//		log.error(">> 요청(request)에 대한 앞단 처리");
//		chain.doFilter(request, response);
//		log.error("<< 응답(response)에 대한 마지막 처리");
//	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		// 로깅 처리: 요청 URI을 콘솔창에 먼저 확인
		HttpServletRequest httpRequest = (HttpServletRequest)request;
		HttpServletResponse httpResponse = (HttpServletResponse)response;
		log.error("요청 URI : {}", httpRequest.getRequestURI());
		chain.doFilter(httpRequest, httpResponse);
		log.error("응답 상태 : {}", httpResponse.getStatus());
	}


	
	
	
}
