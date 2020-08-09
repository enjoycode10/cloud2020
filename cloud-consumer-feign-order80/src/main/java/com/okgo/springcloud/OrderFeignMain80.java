package com.okgo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.core.annotation.Order;

/**
 * @author Shawn
 * @date 2020/3/27 16:11
 * @title Function
 */
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class OrderFeignMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain80.class, args);
    }
}
