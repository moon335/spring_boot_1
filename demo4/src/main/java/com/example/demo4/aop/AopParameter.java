package com.example.demo4.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component // IoC의 관리 대상이 된다.
public class AopParameter {
	
	// 포인트 컷
	// role 설정
	// execution 표현식
	@Pointcut("execution(* com.example.demo4.controller..*.*(..))")
	private void cut() {}
	
	// cut() 메서드가 실행 되는 지점 이전에 before() 메서드를 실행
	@Before("cut()")
	public void before(JoinPoint joinpoint) {
		
		// 활용 - 어떤 메서드가 동작 되었는지 확인
		MethodSignature methodSignature = (MethodSignature)joinpoint.getSignature();
		Method method = methodSignature.getMethod();
		
		Object[] args = joinpoint.getArgs();
		
		System.out.println("before 수행");
		// 매개 변수 출력
		for (Object obj : args) {
			System.out.println("type : " + obj.getClass().getSimpleName());
			System.out.println("value : " + obj);
		}
		
		// controller -> /api/get 호출 전에 수행되는 녀석
		// 어떤 메서드가 수행되었는지 알아 보는 방법
		System.out.println("사용된 메서드 확인 : " + method.getName());
	}
	
	@AfterReturning(value = "cut()", returning = "obj")
	public void afterReturn(JoinPoint joinPoint, Object obj) {
		System.out.println("=======================");
		System.out.println("return obj");
		System.out.println("obj : " + obj);
	}
	
} // end of class
