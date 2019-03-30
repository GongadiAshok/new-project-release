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

import com.Wfd.CartManagement.Entity.OrderDetails;
import com.Wfd.CartManagement.Services.OrderDetailsService;

/**
 * @author DELL
 *
 */
@RequestMapping("/OrderDetails")
@RestController
public class OrderDetailsController {
	@Autowired
	OrderDetailsService orderDeatilsService;

	@RequestMapping(method = RequestMethod.POST)
	public OrderDetails createOrderDetails(@RequestBody OrderDetails pOrderDetails) {
		return orderDeatilsService.createOrderDetails(pOrderDetails);
	}

	@RequestMapping(value = "/{orderDetailsId}", method = RequestMethod.GET)
	public OrderDetails getOrderDetails(@PathVariable Integer orderDetailsId) {
		return orderDeatilsService.getOrderDetails(orderDetailsId);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public OrderDetails updateOrderDetails(@RequestBody OrderDetails pOrderDetails) {
		return orderDeatilsService.updateOrderDetails(pOrderDetails);
	}

	@RequestMapping(value = "/{orderDetailsId}", method = RequestMethod.DELETE)
	public String deleteOrderDetails(@PathVariable Integer orderDetailsId) {
		return orderDeatilsService.deleteOrderDetails(orderDetailsId);
	}

}
