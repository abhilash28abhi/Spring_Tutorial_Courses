package com.spring.aop.business;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.aop.data.Dao2;

@Service
public class Business2 {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private Dao2 Dao2;
	
	public String calculateSomething() {
		//Business Logic
		String value = Dao2.retrieveSomething();
		logger.info("In Business - {}", value);
		return value;
	}
}
