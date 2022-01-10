package com.ermanetwork.springbootconsuldiscoveryexample;

import config.ServiceProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableConfigurationProperties({ ServiceProperties.class, LiquibaseProperties.class})
@RefreshScope
public class SpringBootConsulDiscoveryExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootConsulDiscoveryExampleApplication.class, args);
    }

}
