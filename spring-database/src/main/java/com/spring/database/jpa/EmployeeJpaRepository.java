package com.spring.database.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.spring.database.entity.Employee;


@Repository
@Transactional
public class EmployeeJpaRepository {
	
	//connect to a database similar to JdbcTemplate
	//EntityManager manages all the enitites which is an interface
	//all the operations are stored in the persistence context
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Employee> findAll() {
		TypedQuery<Employee> namedQuery = entityManager.createNamedQuery("find_all_employees", Employee.class);
		return namedQuery.getResultList();
	}
	
	public Employee findById(int id) {
		return entityManager.find(Employee.class, id);
	}
	
	public Employee update(Employee employee) {
		return entityManager.merge(employee);
	}
	
	public Employee insert(Employee employee) {
		return entityManager.merge(employee);
	}
	
	public void delete(int id) {
		Employee employee = findById(id);
		entityManager.remove(employee);
	}
}
