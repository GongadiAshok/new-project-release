/**
 * 
 */
package com.Wfd.CartManagement.Repositiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Wfd.CartManagement.Entity.Item;

/**
 * @author DELL
 *
 */
public interface ItemRepository extends JpaRepository<Item, Integer>{

}
