package com.zxq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 业务服务
 */
@SpringBootApplication
@EnableDiscoveryClient//激活Eureka中的DiscoveryClient实现
public class HelloServiceApplication2 {
    public static void main(String[] args) {
        SpringApplication.run(HelloServiceApplication2.class, args);
    }
}
