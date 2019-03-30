/**
 * 
 */
package com.Wfd.CartManagement.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Wfd.CartManagement.Entity.Employee;
import com.Wfd.CartManagement.Repositiory.EmployeeReposititory;

/**
 * @author DELL
 *
 */
@Service
public class EmployeeserviceImpl implements EmployeeService{
	
	@Autowired
	EmployeeReposititory employeeReposititory;

	@Override
	public Employee createEmployee(Employee pEmployee) {
		return employeeReposititory.save(pEmployee);
	}

	@Override
	public Employee getEmployee(Integer employeeId) {
		return employeeReposititory.findById(employeeId).get();
	}

	@Override
	public Employee updateEmployee(Employee pEmployee) {
		return employeeReposititory.save(pEmployee);
	}

	@Override
	public String deleteEmployee(Integer employeeId) {
		employeeReposititory.deleteById(employeeId);
		return "Employee Details deleted Successfully";
	}
	
	

}
