package com.ems.main.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ems.main.model.Account;
import com.ems.main.repository.AccountRepository;

@CrossOrigin(origins="http://localhost:4200/")
@RestController
@RequestMapping("mapi")
public class AccountController {

	@Autowired
	AccountRepository arepo;
	
	
	@PostMapping("msave")
	public String saveData(@RequestBody Account account) {
		System.out.println(account);
		arepo.save(account);
		return "SUCCESS";
	}
	
}
