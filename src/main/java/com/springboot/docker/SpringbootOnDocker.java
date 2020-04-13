package com.springboot.docker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootOnDocker {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringbootOnDocker.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringbootOnDocker.class, args);
		LOGGER.info("SpringbootOnDocker application started successfully.");
	}
}
