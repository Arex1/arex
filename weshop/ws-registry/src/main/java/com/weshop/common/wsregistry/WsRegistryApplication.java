package com.weshop.common.wsregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WsRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(WsRegistryApplication.class, args);
    }

}
