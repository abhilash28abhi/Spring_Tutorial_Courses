package com.spring.database;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.database.entity.Person;
import com.spring.database.jdbc.PersonJdbcDao;

//@SpringBootApplication
public class SpringDatabaseApplication implements CommandLineRunner {
	
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private PersonJdbcDao personJdbcDao;

	public static void main(String[] args) {
		SpringApplication.run(SpringDatabaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.info("All Users -> {}", personJdbcDao.findAll());
		LOGGER.info("User id 10001 -> {}", personJdbcDao.findById(10001));
		LOGGER.info("Deleting 10002 -> No of rows deleted {}", personJdbcDao.deleteById(10002));
		LOGGER.info("Inserting 10004 -> {} ", personJdbcDao.insert(new Person(10004, "ALEX", "TEXAS", new Date())));
		LOGGER.info("Update 10003 -> {} ", personJdbcDao.update(new Person(10004, "KEVIN", "JAPAN", new Date())));
	}
}
