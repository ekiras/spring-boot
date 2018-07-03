package com.ekiras.hello.starter.autoconfigure;

import com.ekiras.hello.service.ConsoleHelloService;
import com.ekiras.hello.service.HelloService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@EnableConfigurationProperties(HelloProperties.class)
@ConditionalOnClass(HelloService.class)
public class HelloServiceAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public HelloService helloService(HelloProperties properties) {
        return new ConsoleHelloService(properties.getPrefix(), properties.getSuffix());
    }
}
