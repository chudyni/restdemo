package com.example.restdemo.controller;

import com.example.restdemo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by marcin.bracisiewicz
 */
@RestController
public class HelloController {

    @Value("${spring.profiles.active}")
    private String environment;

    @Value("${environment.message}")
    private String message;

    @GetMapping("/greetings")
    public String greetings() {
        return "Environment: " + this.environment + " " + this.message;
    }

}
