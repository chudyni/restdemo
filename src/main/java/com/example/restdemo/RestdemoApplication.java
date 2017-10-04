package com.example.restdemo;

import com.example.restdemo.service.HelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class RestdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestdemoApplication.class, args);
	}

	@Bean
	@Profile("development")
	public HelloService dev() {
		return () -> "Using dev beans";
	}

	@Bean
	@Profile("stage")
	public HelloService stage() {
		return () -> "Stage components";
	}

}


