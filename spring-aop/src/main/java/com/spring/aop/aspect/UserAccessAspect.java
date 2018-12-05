package com.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//this class would intercept the calls to the business layer components
@Configuration
@Aspect
public class UserAccessAspect {
	
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	//what kind of methods i would intercept
	//execution(* PACKAGE.*.*(..)) from L to R-->intercept method calls which return any type
	//in the specific package any class (.*) all method calls(.*) irrespective of their arguments(..)
	//intercepting all method calls to business layer
	@Before("execution(* com.spring.aop.business.*.*(..))") //expression passed to @Before is the point cut
	public void before (JoinPoint point) {
		//what to do?
		//can check for user access here as a business logic
		//the logic within the method is called Advice ie what needs to be done once the calls are intercepted
		LOGGER.info("Check for user access");
		LOGGER.info("Allowed execution for {}", point);
	}
}
