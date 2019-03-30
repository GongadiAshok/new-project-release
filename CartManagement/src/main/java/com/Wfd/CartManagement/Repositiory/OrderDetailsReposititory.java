/**
 * 
 */
package com.Wfd.CartManagement.Repositiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Wfd.CartManagement.Entity.OrderDetails;

/**
 * @author DELL
 *
 */
public interface OrderDetailsReposititory extends JpaRepository<OrderDetails, Integer>{

}
