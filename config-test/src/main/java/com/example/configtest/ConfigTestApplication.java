package com.example.configtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class ConfigTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigTestApplication.class, args);
	}

}
