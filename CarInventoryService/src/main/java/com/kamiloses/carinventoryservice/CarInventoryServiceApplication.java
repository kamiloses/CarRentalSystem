package com.kamiloses.carinventoryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.kamiloses.carinventoryservice.repository")
@EnableDiscoveryClient
public class CarInventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarInventoryServiceApplication.class, args);
    }

}
