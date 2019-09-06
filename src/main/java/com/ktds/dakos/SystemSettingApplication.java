package com.ktds.dakos;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SystemSettingApplication {

	private static Logger logger = LogManager.getLogger(SystemSettingApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SystemSettingApplication.class, args);
		logger.info("###Starting Spring Boot Application###");
	}

}
