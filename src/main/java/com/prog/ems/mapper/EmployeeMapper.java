package com.prog.ems.mapper;

import com.prog.ems.dto.EmployeeDTO;
import com.prog.ems.entity.Employee;

public class EmployeeMapper {
	public static EmployeeDTO mapToEmployeeDTO(Employee employee) {
		//EmployeeDTO employeeDTO = new EmployeeDTO();
		return new EmployeeDTO(
				employee.getId(), 
				employee.getFirstName(), 
				employee.getLastName(), 
				employee.getEmail());
		
	}
	public static Employee mapToEmployee(EmployeeDTO employeeDTO) {
		return new Employee(
				employeeDTO.getId(),
				employeeDTO.getFirstName(),
				employeeDTO.getLastName(),
				employeeDTO.getEmail()
				);
	}

}
