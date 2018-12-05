package com.spring.demo.springdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.demo.springdemo.dao.PersonDAO;

@SpringBootApplication
public class SpringDemoScopeApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringDemoScopeApplication.class);
	
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDemoScopeApplication.class, args);
		
		PersonDAO personDao = context.getBean(PersonDAO.class);
		PersonDAO personDao1 = context.getBean(PersonDAO.class);
		
		LOGGER.info("{}", personDao);
		LOGGER.info("{}", personDao.getJdbcConnection());
		
		LOGGER.info("{}", personDao1);
		LOGGER.info("{}", personDao1.getJdbcConnection());
	}
}