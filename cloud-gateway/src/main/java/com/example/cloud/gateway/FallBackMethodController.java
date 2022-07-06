package com.example.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

	@GetMapping("/userServiceFallBack")
	public String userServiceFallBack() {
		return "User Service is not wokring...";
	}
	
	@GetMapping("/departmentServiceFallBack")
	public String departmentServiceFallBack() {
		return "Department Service is not wokring";
	}
	
}
