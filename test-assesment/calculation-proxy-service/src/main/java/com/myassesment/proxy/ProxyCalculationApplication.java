package com.myassesment.proxy;
/***
 * 
 * Spring Boot Main proxy class to start the tomcat inside docker and provide all REST
 * end points Required to scan all packages in order to start properly
 *
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.myassesment.proxy")
@EnableDiscoveryClient
public class ProxyCalculationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProxyCalculationApplication.class, args);
	}

}
