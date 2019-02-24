package com.angularandspringboot.controllers;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angularandspringboot.model.User;
import com.angularandspringboot.repository.UsersRepository;

@RestController
@RequestMapping("/api")
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	private UsersRepository userRepository;

	@GetMapping(value = "/")
	public String test() {

		logger.info("Testing my service");
		return "Its working";
		
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(value = "/getAllUsers")
	private static List<User> getAllUsers() {

		User user1 = new User();
		user1.setId("1");
		user1.setName("Ranjit");

		User user2 = new User();
		user2.setId("2");
		user2.setName("santosh");

		user2.getName();

		return Arrays.asList(user1, user2);
	}

	public static void main(String[] args) {
		getAllUsers();
		Arrays.asList("Sring");
	}
}
