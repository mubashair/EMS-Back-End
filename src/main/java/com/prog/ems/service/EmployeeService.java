package com.prog.ems.service;

import java.util.List;

import com.prog.ems.dto.EmployeeDTO;

//code to interface is best practice
public interface EmployeeService {
	//creating an employee
	EmployeeDTO createEmployee(EmployeeDTO employeeDTO);
	//finding a particular employee with given id
	EmployeeDTO getEmployeeById(Long emloyeeId);
	//finding a list of employees
	//that is all employees
	List<EmployeeDTO> findAllEmployees();
	//update an employee based on id
	EmployeeDTO updateEmployee(Long employeeId, EmployeeDTO updatedEmployee);
	
}
