/**
 * 
 */
package com.Wfd.CartManagement.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Wfd.CartManagement.Entity.Orders;
import com.Wfd.CartManagement.Repositiory.OrdersReposititory;

/**
 * @author DELL
 *
 */
@Service
public class OrdersServiceImpl  implements OrdersServcice{
	@Autowired
	OrdersReposititory ordersReposititiory;

	@Override
	public Orders createOrders(Orders pOrders) {
		return ordersReposititiory.save(pOrders);
	}

	@Override
	public Orders getorders(Integer orderId) {
		return ordersReposititiory.findById(orderId).get();
	}

	@Override
	public Orders updateOrders(Orders pOrders) {
		return ordersReposititiory.save(pOrders);
	}

	@Override
	public String deleteOrders(Integer orderId) {
		ordersReposititiory.deleteById(orderId);
		return "Orders Details Deleted";
	}

	}

