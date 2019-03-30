/**
 * 
 */
package com.Wfd.CartManagement.Services;

import com.Wfd.CartManagement.Entity.Customer;

/**
 * @author DELL
 *
 */
public interface CustomerService {

	Customer createCustomer(Customer pCustomer);

	Customer getCustomer(Integer customerId);

	Customer updateCustomer(Customer pCustomer);

	String deleteCustomer(Integer customerId);


}
