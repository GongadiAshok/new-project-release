/**
 * 
 */
package com.Wfd.CartManagement.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Wfd.CartManagement.Entity.Item;
import com.Wfd.CartManagement.Repositiory.ItemRepository;

/**
 * @author DELL
 *
 */
@Service
public class ItemServiceImpl implements ItemService{
	
	
	@Autowired
	ItemRepository itemRepository;

	@Override
	public Item createItem(Item pItem) {
		
		return itemRepository.save(pItem);
	}

	@Override
	public Item getItem(Integer itemId) {

		return itemRepository.findById(itemId).get();
	}

	@Override
	public Item updateItem(Item pItem) {

		return itemRepository.save(pItem);
	}

	@Override
	public String deleteItem(Integer itemId) {
		itemRepository.deleteById(itemId);
		return "Deleted";
	}

}
