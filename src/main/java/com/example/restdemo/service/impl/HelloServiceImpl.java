package com.example.restdemo.service.impl;

import com.example.restdemo.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author marcin.bracisiewicz
 */
@Service
public class HelloServiceImpl implements HelloService {

  @Override
  public String sayHello() {
    return "I'm present!";
  }

}
