package com.jp.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class JpEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpEurekaServerApplication.class, args);
    }

}
