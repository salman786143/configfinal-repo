package com.example.configtest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class ConfigTestController {

    @Value("${message:Hello default}")
	private String name;
	
	@GetMapping("/hello")
	public String fetchName() {
		
		return name;
	}
	

}
