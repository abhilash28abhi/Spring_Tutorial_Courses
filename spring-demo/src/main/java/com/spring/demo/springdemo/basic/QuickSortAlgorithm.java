package com.spring.demo.springdemo.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
//@Qualifier(value="quick")
public class QuickSortAlgorithm implements SortAlgorithm {
	
	public int[] sort(int[] numbers) {
		//login for bubble sort
		return numbers;
	}
}
