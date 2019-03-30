/**
 * 
 */
package com.Wfd.CartManagement.Services;

import com.Wfd.CartManagement.Entity.Orders;

/**
 * @author DELL
 *
 */
public interface OrdersServcice {

	Orders createOrders(Orders pOrders);

	Orders getorders(Integer orderId);

	Orders updateOrders(Orders pOrders);

	String deleteOrders(Integer orderId);

}
