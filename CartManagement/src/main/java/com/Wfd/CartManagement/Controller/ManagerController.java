package com.Wfd.CartManagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Wfd.CartManagement.Entity.Manager;
import com.Wfd.CartManagement.Services.ManagerService;

@RequestMapping("/manager")
@RestController
public class ManagerController {
	@Autowired
	ManagerService managerService;

	@RequestMapping(method = RequestMethod.POST)
	public Manager createManager(@RequestBody Manager mName) {
		return managerService.createManager(mName);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Manager getManager(@PathVariable Integer id) {
		return managerService.getManager(id);
	}

	@RequestMapping( method = RequestMethod.PUT)
	public Manager updateManager(@RequestBody Manager mName) {
		return managerService.updateManager(mName);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public String deleteManager(@PathVariable Integer id) {
		return managerService.deleteManager(id);
	}
}
