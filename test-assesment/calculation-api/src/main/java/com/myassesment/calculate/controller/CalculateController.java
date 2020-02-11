package com.myassesment.calculate.controller;

import javax.validation.constraints.NotNull;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/***
 * 
 * @author Vikas Waskale
 * @apiNote - this REST API controller used to multiply two integers and provide
 *          the results
 */

@RestController
public class CalculateController {

	/**
	 * Get method to multiply two integers and send the result as a string
	 * 
    */

	@GetMapping(value = "/multiply/{a},{b}")
	public String multiplyTwoNumbers(@PathVariable("a") @NotNull Integer num1,
			@PathVariable("b") @NotNull Integer num2) {
		
		// Calculate the two numbers and provide result
		return String.format("Result of two numbers is = " + (num1 * num2));
	}

}
