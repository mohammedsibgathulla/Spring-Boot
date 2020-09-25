package com.lowes.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class DemoApplication {
	private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);
	@Value("${spring.application.name}")
	private String appName;
	public static void main(String[] args) {
		logger.info("this is a info message");
		logger.warn("this is a warn message");
		logger.error("this is a error message");
		SpringApplication.run(DemoApplication.class, args);
	}
	@RequestMapping(value = "/hello")
	public String applicationName() {
		return appName;
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
