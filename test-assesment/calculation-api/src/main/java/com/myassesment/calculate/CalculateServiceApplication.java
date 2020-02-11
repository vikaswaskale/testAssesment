package com.myassesment.calculate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/***
 * 
 * Spring Boot Main class to start the tomcat inside docker and provide all REST
 * end points Required to scan all packages in order to start properly
 *
 */

@SpringBootApplication
@EnableDiscoveryClient
public class CalculateServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculateServiceApplication.class, args);
	}

}
