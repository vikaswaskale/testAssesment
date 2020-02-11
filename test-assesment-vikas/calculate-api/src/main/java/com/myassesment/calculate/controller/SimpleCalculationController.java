package com.myassesment.calculate.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.swagger.annotations.ApiOperation;

@RestController
public class SimpleCalculationController {
	
	
	

	    /**
	     * @param num1
	     * @param num2
	     * @return String results of multiplicaiton
	     */
	    @RequestMapping(method = RequestMethod.GET, value = "/mul/{num1}/{num2}", produces = "text/plain")
	    @ApiOperation("Multiplies two numbers passed as path parameters")
	    public String mul(@PathVariable("num1") Integer num1, @PathVariable("num2") Integer num2) {
	        return String.format("%d x %d = %d", num1, num2, (num1 * num2));
	    }


}
