package com.example.demo8.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
/*
 * 1. WebMvcConfigurer 구현 처리 하기
 * 2. addInterceptors를 구현해야 한다.
 */
@Configuration // 1개 이상 빈으로 등록해야 할 때
public class WebMvcConfig implements WebMvcConfigurer{
	
	// DI를 사용하는 코드로 변경해보자.
	@Autowired // 어노테이션 사용해서 DI 적용
	private LoggingInterceptor loggingInterceptor;
	
//	public WebMvcConfig(LoggingInterceptor loggingInterceptor) {
//		this.loggingInterceptor = loggingInterceptor;
//	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		WebMvcConfigurer.super.addInterceptors(registry);
		// 우리가 직접 만든 인터셉터 구현 클래스를 등록 처리
		registry.addInterceptor(loggingInterceptor);
	}
	
	
} // end of class
