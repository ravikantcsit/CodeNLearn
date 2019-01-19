package com.ravikant.springapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloAppApplication extends SpringBootServletInitializer {
	
	@Value("${spring.application.name:HelloAppApplication}")
	   private String name;

	public static void main(String[] args) {
		SpringApplication.run(HelloAppApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(HelloAppApplication.class);
	}
	
	@RequestMapping(value="/")
	public String hello() {
		return "Hello Innodeed by "+name+" in demo";
		
	}
}
