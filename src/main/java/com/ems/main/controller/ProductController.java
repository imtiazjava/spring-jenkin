package com.ems.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ems.main.repository.Product;
import com.ems.main.repository.ProductRepository;

@CrossOrigin(origins="http://localhost:4200/")
@RestController
@RequestMapping("myapi/")
public class ProductController {
	
	@Autowired
	ProductRepository prepo;
	
	
	@GetMapping("products")
	public List<Product> getAllProducts(){
		return prepo.findAll(); 
	}
}
