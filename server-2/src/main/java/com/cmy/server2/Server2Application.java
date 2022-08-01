package com.cmy.server2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author cao.mingyu
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class Server2Application {

    public static void main(String[] args) {
        SpringApplication.run(Server2Application.class, args);
    }

}
