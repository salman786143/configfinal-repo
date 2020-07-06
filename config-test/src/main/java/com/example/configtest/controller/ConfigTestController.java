package com.example.configtest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
@RefreshScope
public class ConfigTestController {

    @Value("${message}")
	private String name;
	
	@GetMapping("/name")
	public String fetchName() {
		
		return name;
	}
	

}
