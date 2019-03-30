/**
 * 
 */
package com.Wfd.CartManagement.Controller;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Wfd.CartManagement.Entity.Customer;
import com.Wfd.CartManagement.Services.CustomerService;

/**
 * @author DELL
 *
 */
@RequestMapping("/Customer")
@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@RequestMapping(method=RequestMethod.POST)
	public Customer createCustomer(@RequestBody Customer pCustomer) {
		return customerService.createCustomer(pCustomer);
	}

     @RequestMapping(value="/{customerId}",method=RequestMethod.GET)
     public Customer getCustomer(@PathVariable Integer customerId) {
    	 return customerService.getCustomer(customerId);
    	 
     }
     @RequestMapping(method=RequestMethod.PUT)
     public Customer updateCustomer(@RequestBody Customer pCustomer) {
    	return customerService.updateCustomer(pCustomer);
     }
     @RequestMapping(value="/{customerId}",method=RequestMethod.DELETE)
     public String deleteCustomer(@PathVariable Integer customerId) {
    	 return customerService.deleteCustomer(customerId);
     }
     
     
     
     
}
