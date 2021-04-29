package com.example.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Link http://projects.spring.io/spring-cloud/spring-cloud.html#_spring_cloud_config
 * 高可用：即是ConfigServer 也是 EurekaClient 注册到 EurekaServer上
 */
@EnableConfigServer
@EnableDiscoveryClient
@RestController
@SpringBootApplication
public class ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }

}
