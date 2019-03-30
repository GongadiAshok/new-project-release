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

import com.Wfd.CartManagement.Entity.Item;
import com.Wfd.CartManagement.Services.ItemService;

/**
 * @author DELL
 *
 */
@RequestMapping("/item")
@RestController
public class ItemController {
	
	@Autowired
	ItemService itemService;
	
	
	@RequestMapping(method=RequestMethod.POST)
	public Item createItem(@RequestBody Item pItem) {
		return itemService.createItem(pItem);
	}
	@RequestMapping(value="/{itemId}",method=RequestMethod.GET)
	
	public Item getItem(@PathVariable Integer itemId) {
		return itemService.getItem(itemId);
	}
	
	@RequestMapping(method=RequestMethod.PUT)
	public Item updateItem(Item pItem) {
		return itemService.updateItem(pItem);
	}
	
	@RequestMapping(value="/{itemId}",method=RequestMethod.DELETE)
	public String deleteItem(@PathVariable Integer itemId) {
		return itemService.deleteItem(itemId);
	}
}
