package com.example.restdemo;

import com.example.restdemo.service.HelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestdemoApplication.class, args);
	}

	@Bean
	@ConditionalOnMissingBean
	public HelloService helloService() {
		return new HelloService() {
			@Override
			public String sayHello() {
				return "You don't have bean - I'm default";
			}
		};
	}

}
