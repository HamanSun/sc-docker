package com.iss.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ScDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScDockerApplication.class, args);
	}
}
