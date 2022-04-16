package com.ems.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ems.main.model.Employee;
import com.ems.main.repository.EmployeeRepository;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("api/")
public class EmployeeController {

	@Autowired
	EmployeeRepository repo;

	@GetMapping("employees")
	public List<Employee> getAllEmployees() {
		return repo.findAll();
	}

	@GetMapping("msg")
	public String getMessage() {
		return "Hello World!";
	}

	@PostMapping("save")
	public String storeData(@RequestBody Employee employee) {
		repo.save(employee);
		return "SUCCESS";
	}

	@PutMapping("update")
	public String updateData(@RequestBody Employee employee) {
		repo.save(employee);
		return "SUCCESS";
	}

}
