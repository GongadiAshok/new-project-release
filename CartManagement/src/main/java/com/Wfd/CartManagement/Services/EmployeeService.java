/**
 * 
 */
package com.Wfd.CartManagement.Services;

import com.Wfd.CartManagement.Entity.Employee;

/**
 * @author DELL
 *
 */

public interface EmployeeService {

	Employee createEmployee(Employee pEmployee);

	Employee getEmployee(Integer employeeId);

	Employee updateEmployee(Employee pEmployee);

	String deleteEmployee(Integer employeeId);

}
