package com.example.restdemo.service.impl;

import com.example.restdemo.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * Created by marcin.bracisiewicz
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello() {
        return "I'm not missing!";
    }

}
