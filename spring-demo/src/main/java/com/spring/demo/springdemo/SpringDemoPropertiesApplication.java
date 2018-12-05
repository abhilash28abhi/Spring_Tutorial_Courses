package com.spring.demo.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.spring.demo.springdemo.properties.SomeExternalService;

@SpringBootApplication
@PropertySource("classpath:app.properties")
public class SpringDemoPropertiesApplication {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDemoPropertiesApplication.class, args);
		SomeExternalService service = context.getBean(SomeExternalService.class);
		System.out.println(service.getUrl());
		
		for (String name : context.getBeanDefinitionNames()) {
			System.out.println("*******" + name);
		}
	}
}