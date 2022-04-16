package com.ems.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ems.main.model.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account,Integer>{

}
