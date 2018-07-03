package com.ekiras.demo.hellostarterapp;

import com.ekiras.hello.service.ConsoleHelloService;
import com.ekiras.hello.service.HelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HelloStarterAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloStarterAppApplication.class, args);
    }
}
