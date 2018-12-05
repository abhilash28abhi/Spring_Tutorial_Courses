package com.spring.database;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.database.entity.Employee;
import com.spring.database.jpa.EmployeeJpaRepository;

//@SpringBootApplication
public class SpringJpaApplication implements CommandLineRunner {
	
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private EmployeeJpaRepository employeeJpaRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.info("Employee id 10001 -> {}", employeeJpaRepository.findById(10001));
		LOGGER.info("Update Employee with id 10002 -> {}", employeeJpaRepository.update(new Employee(10002, "UPDATED EMPLOYEE", "NY", new Date())));
		LOGGER.info("Insert Employee -> {}", employeeJpaRepository.update(new Employee("EMPLOYEE4", "PAK", new Date())));
		employeeJpaRepository.delete(10002);
		LOGGER.info("All employees -> {}", employeeJpaRepository.findAll());
	}
}
