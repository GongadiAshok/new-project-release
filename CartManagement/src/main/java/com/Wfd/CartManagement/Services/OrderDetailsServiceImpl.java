package com.Wfd.CartManagement.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Wfd.CartManagement.Entity.OrderDetails;
import com.Wfd.CartManagement.Repositiory.OrderDetailsReposititory;

@Service
public class OrderDetailsServiceImpl implements OrderDetailsService{
	@Autowired
	OrderDetailsReposititory orderDetailsReposititory;

	@Override
	public OrderDetails createOrderDetails(OrderDetails pOrderDetails) {
		return orderDetailsReposititory.save(pOrderDetails);
	}

	@Override
	public OrderDetails getOrderDetails(Integer orderDetailsId) {
		return orderDetailsReposititory.findById(orderDetailsId).get();
	}

	@Override
	public OrderDetails updateOrderDetails(OrderDetails pOrderDetails) {
		return orderDetailsReposititory.save(pOrderDetails);
	}

	@Override
	public String deleteOrderDetails(Integer orderDetailsId) {
		orderDetailsReposititory.deleteById(orderDetailsId);
		return "OrderDetails Deleted";
	}

}
