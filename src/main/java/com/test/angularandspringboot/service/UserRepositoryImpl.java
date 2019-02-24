package com.test.angularandspringboot.service;

import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ReflectionUtils;

import com.test.angularandspringboot.model.Address;

public class UserRepositoryImpl {

	private static final Logger logger = LoggerFactory.getLogger(UserRepositoryImpl.class);

	public static void main(String[] args) {

		try {

			logger.info("Testing my Service");
			Class<?> forName = Class.forName("com.angularandspringboot.service.UserRepositoryImpl");
		} catch (ClassNotFoundException e) {
			logger.error("Error occured while loading the class: {}", e.getMessage());
		}
		// This is used to create an object to be check.
		Method[] allDeclaredMethods = ReflectionUtils.getAllDeclaredMethods(Address.class);
		for (Method method : allDeclaredMethods) {
			logger.info("Method available: {}", method.getName());
			System.out.println(method.toString());
		}

		logger.info("Methods successfully completed");

	}

}
