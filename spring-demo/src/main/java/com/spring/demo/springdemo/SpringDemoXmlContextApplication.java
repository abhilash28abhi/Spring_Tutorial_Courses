package com.spring.demo.springdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.demo.springdemo.dao.xml.XMLPersonDAO;

public class SpringDemoXmlContextApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringDemoXmlContextApplication.class);
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		XMLPersonDAO xmlPersonDAO = context.getBean(XMLPersonDAO.class);
		LOGGER.info("{}", xmlPersonDAO);
		LOGGER.info("{}", xmlPersonDAO.getXmlJdbcConnection());
		
		LOGGER.info("{}", (Object)context.getBeanDefinitionNames());//gives [xmlJdbcConnection, xmlPersonDao]
		context.close();
	}
}