package com.tzc.ljq.cloudcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CloudCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudCoreApplication.class, args);
    }
}
