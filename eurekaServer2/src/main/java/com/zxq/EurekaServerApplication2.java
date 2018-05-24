package com.zxq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 服务注册中心2
 */
@SpringBootApplication
@EnableEurekaServer//启动服务注册中心注释
public class EurekaServerApplication2 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication2.class, args);
    }
}
