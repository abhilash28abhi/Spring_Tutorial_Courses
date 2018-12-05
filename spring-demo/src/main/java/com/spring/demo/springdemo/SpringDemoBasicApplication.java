package com.spring.demo.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring.demo.springdemo.basic.BinarySearchImpl;

@SpringBootApplication
public class SpringDemoBasicApplication {
	
	//what are the beans?
	//what are the dependencies of a bean?
	//where to search for beans?
	
	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		ConfigurableApplicationContext context = SpringApplication.run(SpringDemoBasicApplication.class, args);
		BinarySearchImpl binarySearch = context.getBean(BinarySearchImpl.class);
		
		//example to check the scope of beans
		BinarySearchImpl binarySearch1 = context.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch);
		System.out.println(binarySearch1);
		
		System.out.println(binarySearch.binarySearch(new int[] {4, 9, 45}, 9));
		context.close();
	}
}