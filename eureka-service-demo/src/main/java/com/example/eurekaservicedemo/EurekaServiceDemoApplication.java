package com.example.eurekaservicedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaServiceDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceDemoApplication.class, args);
    }

}
