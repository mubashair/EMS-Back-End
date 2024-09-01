package com.prog.ems.service;

import com.prog.ems.dto.EmployeeDTO;

//code to interface is best practice
public interface EmployeeService {
	EmployeeDTO createEmployee(EmployeeDTO employeeDTO);
	EmployeeDTO getEmployeeById(Long emloyeeId);
	
}
