package com.Wfd.CartManagement.Services;

import com.Wfd.CartManagement.Entity.Manager;

public interface ManagerService {

	Manager getManager(Integer id);

	Manager updateManager(Manager mName);

	String deleteManager(Integer id);

	Manager createManager(Manager mName);





}
