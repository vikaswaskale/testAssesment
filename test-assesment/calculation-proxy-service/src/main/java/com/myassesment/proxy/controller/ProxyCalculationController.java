package com.myassesment.proxy.controller;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
 * @author vikas
 *  
 *  Proxy calculation controller to call the serving api to giv the results of two integers
 *
 */
@RestController
public class ProxyCalculationController {
	@Autowired
	private CalculationServiceProxy proxy;

	/**
	 * 
	 * To multiply the two integers, calling the proxy service to calculate and get
	 * the results
	 */

	@GetMapping(value = "/multiply-two-numbers/{a},{b}")
	public String multiplyTwoNumbers(@PathVariable("a") @NotNull Integer num1, @PathVariable("b") @NotNull Integer num2)
			throws Exception {
		String response = proxy.multiplyTwoNumbers(num1, num2);

		return response;
	}
}
