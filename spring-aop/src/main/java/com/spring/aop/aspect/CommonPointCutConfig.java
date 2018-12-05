package com.spring.aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

//Class to put all the various point cuts used in the app in a common place
public class CommonPointCutConfig {
	
	@Pointcut("execution(* com.spring.aop.data.*.*(..))")
	public void dataLayerExecution() {
		
	}
	
	@Pointcut("execution(* com.spring.aop.business.*.*(..))")
	public void bussinessLayerExecution() {}
	
	
	//combine business and the data layer
	@Pointcut("com.spring.aop.aspect.CommonPointCutConfig.dataLayerExecution() && com.spring.aop.aspect.CommonPointCutConfig.bussinessLayerExecution()")
	public void allLayerExecution() {}
	
	//bean containing the pattern in its name
	@Pointcut("bean(*dao*)")
	public void beanContainingDao(){}
	
	@Pointcut("@annotation(com.spring.aop.aspect.TrackTime)")
	public void trackTimeAnnotation() {}
}
