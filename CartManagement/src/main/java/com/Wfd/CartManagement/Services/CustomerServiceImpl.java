/**
 * 
 */
package com.Wfd.CartManagement.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Wfd.CartManagement.Entity.Customer;
import com.Wfd.CartManagement.Repositiory.CustomerRepositiory;

/**
 * @author DELL
 *
 */@Service
public class CustomerServiceImpl implements CustomerService{
	 @Autowired
	 CustomerRepositiory customerRepositiory;

	@Override
	public Customer createCustomer(Customer pCustomer) {
		return customerRepositiory.save(pCustomer);
	}

	@Override
	public Customer getCustomer(Integer customerId) {

		return customerRepositiory.findById(customerId).get();
	}

	@Override
	public Customer updateCustomer(Customer pCustomer) {
		
		return customerRepositiory.save(pCustomer);
	}

	@Override
	public String deleteCustomer(Integer customerId) {
		 customerRepositiory.deleteById(customerId);
		 return customerId+" Deleted Customer";
	}

}
