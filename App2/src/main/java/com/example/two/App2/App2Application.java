package com.example.two.App2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class App2Application {

	public static void main(String[] args) {
		SpringApplication.run(App2Application.class, args);
	}

}
