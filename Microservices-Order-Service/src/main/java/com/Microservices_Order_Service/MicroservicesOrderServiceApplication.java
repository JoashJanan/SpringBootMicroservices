package com.Microservices_Order_Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroservicesOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesOrderServiceApplication.class, args);
	}

}
