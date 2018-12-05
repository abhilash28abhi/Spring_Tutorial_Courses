package com.spring.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class MethodExecutionCalculationAspect {
	
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	//find the time required to execute the methods
	@Around(value="com.spring.aop.aspect.CommonPointCutConfig.trackTimeAnnotation()")
	public void around(ProceedingJoinPoint point) throws Throwable {
		//ProceedingJoinPoint will intercept the method allow it to proceed and then find the time taken
		//startTime=x
		//allow method execution
		//endTime=y
		long startTime = System.currentTimeMillis();
		point.proceed();//allow it to proceed
		long endTime = System.currentTimeMillis() - startTime;
		LOGGER.info("Time taken by {} is {}", point, endTime);
	}
}
