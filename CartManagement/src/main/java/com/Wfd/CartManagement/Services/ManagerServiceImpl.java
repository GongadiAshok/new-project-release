/**
 * 
 */
package com.Wfd.CartManagement.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Wfd.CartManagement.Entity.Manager;
import com.Wfd.CartManagement.Repositiory.ManagerRepositiory;

/**
 * @author DELL
 *
 */
@Service
public class ManagerServiceImpl implements ManagerService {
@Autowired
	ManagerRepositiory managerRepositiory;

@Override
public Manager getManager(Integer id) {
	return managerRepositiory.findById(id).get();
}

@Override
public Manager updateManager(Manager mName) {
	return managerRepositiory.save(mName);
}

@Override
public String deleteManager(Integer id) {
	managerRepositiory.deleteById(id);
	return id+"Manager details removed Successfully";
}

@Override
public Manager createManager(Manager mName) {
	return managerRepositiory.save(mName);
}

}
