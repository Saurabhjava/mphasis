package com.aop;


import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	@Pointcut("execution(* com.service.*.*(..))")
	public void allServiceMethod() {
	}
	
	@Before("allServiceMethod()")
	public void logBefore(JoinPoint jp) {
		System.out.println("Before Method "+jp.getSignature().getName()+" called");
		System.out.println("you called this method at "+new Date());
		System.out.println("***************************************************");
	}
	
	@After("allServiceMethod()")
	public void logAfter(JoinPoint jp) {
		System.out.println("After Method "+jp.getSignature().getName()+" called");
		System.out.println("***************************************************");
	}
	@AfterReturning(pointcut = "allServiceMethod()", returning = "result")
	public void logAfterReturning(JoinPoint jp, Object result) {
		System.out.println("Method Return "+ result);
	}
	
	@AfterThrowing(pointcut = "allServiceMethod()", throwing = "error")
	public void logAfterError(JoinPoint jp, Throwable error) {
		System.out.println("Method throw an error---> "+ error);
	}
}






