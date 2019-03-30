/**
 * 
 */
package com.Wfd.CartManagement.Repositiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Wfd.CartManagement.Entity.Orders;

/**
 * @author DELL
 *
 */
public interface OrdersReposititory extends JpaRepository<Orders, Integer>{

}
