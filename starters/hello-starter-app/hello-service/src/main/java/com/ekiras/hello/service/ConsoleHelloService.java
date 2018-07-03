package com.ekiras.hello.service;

import org.springframework.boot.CommandLineRunner;

public class ConsoleHelloService implements HelloService, CommandLineRunner {

    private String prefix;
    private String suffix;

    public ConsoleHelloService() {
        this("Hello", "!!");
    }

    public ConsoleHelloService(String prefix, String suffix) {
        this.prefix = prefix;
        this.suffix = suffix;
    }

    @Override
    public void sayHello(String name) {
        System.out.println(String.format("%s %s%s", prefix, name, suffix));
    }

    @Override
    public void run(String... args) throws Exception {
        sayHello("World");
    }
}
