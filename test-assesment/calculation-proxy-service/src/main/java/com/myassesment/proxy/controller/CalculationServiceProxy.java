package com.myassesment.proxy.controller;

import javax.validation.constraints.NotNull;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/***
 *  @author vikas
 * Spring Boot proxy Interface to initiate the call for calculation-api
 * Using a Feign client to call it dynamic call and Ribbon for load balancing
 *
 */

@FeignClient(name="calculation-api")
@RibbonClient (name="calculation-api")
public interface CalculationServiceProxy {
	
	/**
	 * Abstract method to calculate the two integers and provide the result
	 */
	@GetMapping (value = "/multiply/{a},{b}")
	 public String multiplyTwoNumbers
	        (@PathVariable("a") @NotNull Integer num1, @PathVariable("b") @NotNull Integer num2) ;
	
}