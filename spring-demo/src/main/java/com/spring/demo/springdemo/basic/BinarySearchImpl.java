package com.spring.demo.springdemo.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
	
	//this is also setter injection
	@Autowired
	//@Qualifier("bubble")
	private SortAlgorithm sortAlgorithm;
	
	//constructor injection
	/*public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}*/
	
	//setter injection
	/*public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}*/

	public int binarySearch(int[] numbers, int numberToSearchFor) {
		//sort the elements
		//search the required element and return the index
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		return sortedNumbers[0];
	}
	
	@PostConstruct
	public void postConstruct() {
		//will be called once the bean is created by spring IOC
		System.out.println("Binary search bean is created");
	}
	
	@PreDestroy
	public void preDestroy() {
		//will be called before the bean is destroyed
		System.out.println("Before Binary Search is destroyed");
	}
}
