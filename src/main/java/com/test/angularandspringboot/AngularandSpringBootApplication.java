package com.test.angularandspringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.test.angularandspringboot.*"})
public class AngularandSpringBootApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(AngularandSpringBootApplication.class);

	public static void main(String[] args) {
		logger.info("Loading the spring application class");
		SpringApplication.run(AngularandSpringBootApplication.class, args);
	}

}

