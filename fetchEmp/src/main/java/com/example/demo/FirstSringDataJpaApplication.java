package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@EnableEurekaClient
@SpringBootApplication

public class FirstSringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSringDataJpaApplication.class, args);
	}
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
			
	}
}
