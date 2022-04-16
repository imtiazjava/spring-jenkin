package com.ems.main.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ems.main.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

	
	
	List<Employee> findAll();
	
}
