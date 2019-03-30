/**
 * 
 */
package com.Wfd.CartManagement.Services;

import com.Wfd.CartManagement.Entity.OrderDetails;

/**
 * @author DELL
 *
 */
public interface OrderDetailsService {

	OrderDetails createOrderDetails(OrderDetails pOrderDetails);

	OrderDetails getOrderDetails(Integer orderDetailsId);

	OrderDetails updateOrderDetails(OrderDetails pOrderDetails);

	String deleteOrderDetails(Integer orderDetailsId);

}
