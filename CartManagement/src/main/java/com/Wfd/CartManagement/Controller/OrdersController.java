/**
 * 
 */
package com.Wfd.CartManagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Wfd.CartManagement.Entity.Orders;
import com.Wfd.CartManagement.Services.OrdersServcice;

/**
 * @author DELL
 *
 */
@RequestMapping("/Orders")
@RestController
public class OrdersController {
	@Autowired
	OrdersServcice orderService;

	@RequestMapping(method = RequestMethod.POST)
	public Orders createOrders(@RequestBody Orders pOrders) {
		return orderService.createOrders(pOrders);
	}

	@RequestMapping(value = "/{orderId}", method = RequestMethod.GET)
	public Orders getCustomer(@PathVariable Integer orderId) {
		return orderService.getorders(orderId);
	}
	@RequestMapping(method=RequestMethod.PUT)
	public Orders updateOrders(@RequestBody Orders pOrders) {
		return orderService.updateOrders(pOrders);
	}

	@RequestMapping(value = "/{orderId}", method = RequestMethod.DELETE)
	public String deleteCustomer(@PathVariable Integer orderId) {
		return orderService.deleteOrders(orderId);
}
}