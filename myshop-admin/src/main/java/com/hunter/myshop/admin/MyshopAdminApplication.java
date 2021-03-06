package com.hunter.myshop.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@EnableAdminServer
@SpringBootApplication
public class MyshopAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyshopAdminApplication.class, args);
    }

}
