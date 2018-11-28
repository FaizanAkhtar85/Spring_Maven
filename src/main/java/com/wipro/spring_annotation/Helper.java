package com.wipro.spring_annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Helper {
	@Before("execution(public void getMicroProcessor())")
	public void log() {
		System.out.println("Called after config method");
	}
}
