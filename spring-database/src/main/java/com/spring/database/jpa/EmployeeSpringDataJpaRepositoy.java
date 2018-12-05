package com.spring.database.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.database.entity.Employee;

@Repository
public interface EmployeeSpringDataJpaRepositoy extends JpaRepository<Employee, Integer> {

}
