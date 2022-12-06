package com.stackfortech.urlShorteningService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UrlShorteningServiceApplication {
	private static final Logger LOGGER = LogManager.getLogger(UrlShorteningServiceApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(UrlShorteningServiceApplication.class, args);
	}

}
