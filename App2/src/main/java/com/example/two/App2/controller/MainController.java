package com.example.two.App2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app2")
public class MainController {

	
	@GetMapping
	public String getHello() {
		return "Hello from APP-2";
	}
	
}
