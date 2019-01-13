package com.rj.angular.IntegrateSpringBootRestApiAngular6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.rj")
@SpringBootApplication
public class IntegrateSpringBootRestApiAngular6Application {

	public static void main(String[] args) {
		SpringApplication.run(IntegrateSpringBootRestApiAngular6Application.class, args);
	}

}

