package com.ms.ratingapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RatingApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RatingApiApplication.class, args);
	}

}
