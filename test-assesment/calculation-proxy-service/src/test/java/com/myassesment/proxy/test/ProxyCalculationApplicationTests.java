package com.myassesment.proxy.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import com.myassesment.proxy.ProxyCalculationApplication;
/**
 * 
 * @author vikas waskale
 * Test class to cover all the possible scenarios for proxy application
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.MOCK, classes={ ProxyCalculationApplication.class })
public class ProxyCalculationApplicationTests {
	
	
	private MockMvc mockMvc;
	
	  @Autowired
	  private WebApplicationContext webApplicationContext;

	  @Before
	  public void setUp() {
		  this.mockMvc = webAppContextSetup(webApplicationContext).build();
	  }
	  
	 @Test
	  public void testWhenTwoNumber() throws Exception {
	    /* setup mock */
	    mockMvc.perform(get("/multiply-two-numbers/8,8")) 
	              .andExpect(status().isOk())
	             .andExpect(content().string("Result of two numbers is = "+64));
	   	  }

	 
	 @Test
	  public void testWhenResultsAreNotCorrect() throws Exception {
	    /* setup mock */
	    mockMvc.perform(get("/multiply-two-numbers/7,a")) 
	              .andExpect(status().isBadRequest());
	            
	   	  }

	 

}
