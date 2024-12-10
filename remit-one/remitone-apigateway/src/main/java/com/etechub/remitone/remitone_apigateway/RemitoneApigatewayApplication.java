package com.etechub.remitone.remitone_apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RemitoneApigatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(RemitoneApigatewayApplication.class, args);
	}

}
