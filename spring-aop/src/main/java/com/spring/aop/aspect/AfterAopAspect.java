package com.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class AfterAopAspect {
	
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	//intercept the calls after the method has been invoked and get their return values
	@AfterReturning(value="com.spring.aop.aspect.CommonPointCutConfig.dataLayerExecution()",
			returning="result")
	public void afterReturning(JoinPoint point, Object result) {
		LOGGER.info("In after aspect {} returned with value {}", point, result);
	}
	
	//intercept the calls after any exceptions are thrown
	@AfterThrowing(value="execution(* com.spring.aop.business.*.*(..))",
			throwing="exception")
	public void afterException (JoinPoint point, Object exception) {
		LOGGER.info("In after aspect {} returned with value {}", point, exception);
	}
	
	
	//will be called in all the scenarios whether or not the method throws any exception
	@After(value="execution(* com.spring.aop.business.*.*(..))")
	public void after(JoinPoint point) {
		LOGGER.info("after execution of {}", point);
	}
}
