package com.test.angularandspringboot.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.angularandspringboot.model.User;


@Repository
public interface UsersRepository extends CrudRepository<User, String> {
	
	public List<User> findAll();
	

}
