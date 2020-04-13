package com.springboot.docker.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {

	private static final Logger LOGGER = LoggerFactory.getLogger(HelloworldController.class);

	@GetMapping(value = "/")
	public String welcome() {
		LOGGER.info("Showing the welcome message.");
		return "Hello world from Springboot!";
	}
}
