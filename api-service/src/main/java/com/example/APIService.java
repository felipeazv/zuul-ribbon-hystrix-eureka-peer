package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class APIService {
	@Autowired
	HystrixFallback fallback;
	
	public static void main(String[] args) {
		SpringApplication.run(APIService.class, args);
	}
}