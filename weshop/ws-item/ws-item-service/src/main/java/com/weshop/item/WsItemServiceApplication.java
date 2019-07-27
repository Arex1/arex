package com.weshop.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Arex
 */
@SpringBootApplication(scanBasePackages = "com.weshop.item.web")
@EnableDiscoveryClient
public class WsItemServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(WsItemServiceApplication.class, args);
    }
}
