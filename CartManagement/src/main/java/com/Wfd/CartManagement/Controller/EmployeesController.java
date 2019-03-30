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

import com.Wfd.CartManagement.Entity.Employee;
import com.Wfd.CartManagement.Services.EmployeeService;

/**
 * @author DELL
 *
 */
@RequestMapping("/Employee")
@RestController
public class EmployeesController {
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(method=RequestMethod.POST)
	public Employee createEmployee(@RequestBody Employee pEmployee) {
		return employeeService.createEmployee(pEmployee);
	}
	@RequestMapping(value="/{employeeId}",method=RequestMethod.GET)
	public Employee getEmployee(@PathVariable Integer employeeId) {
		return employeeService.getEmployee(employeeId);
	}


	@RequestMapping(method=RequestMethod.PUT)
	public Employee updateEmployee(@RequestBody Employee pEmployee) {
		return employeeService.updateEmployee(pEmployee);
	}
	@RequestMapping(value="/{employeeId}",method=RequestMethod.DELETE)
	public String deleteEmployee(@PathVariable Integer employeeId) {
		return employeeService.deleteEmployee(employeeId);
	}

}
