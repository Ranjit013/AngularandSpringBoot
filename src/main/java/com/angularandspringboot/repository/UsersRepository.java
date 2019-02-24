package com.angularandspringboot.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.angularandspringboot.model.User;


@Repository
public interface UsersRepository extends CrudRepository<User, String> {
	
	public List<User> findAll();
	

}
