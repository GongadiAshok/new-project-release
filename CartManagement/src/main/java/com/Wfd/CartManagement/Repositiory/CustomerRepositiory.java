/**
 * 
 */
package com.Wfd.CartManagement.Repositiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Wfd.CartManagement.Entity.Customer;

/**
 * @author DELL
 *
 */
public interface CustomerRepositiory extends JpaRepository<Customer, Integer> {

}
