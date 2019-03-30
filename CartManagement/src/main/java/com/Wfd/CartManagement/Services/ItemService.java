/**
 * 
 */
package com.Wfd.CartManagement.Services;

import com.Wfd.CartManagement.Entity.Item;

/**
 * @author DELL
 *
 */
public interface ItemService {

	Item createItem(Item pItem);

	Item getItem(Integer itemId);

	Item updateItem(Item pItem);

	String deleteItem(Integer itemId);

}
