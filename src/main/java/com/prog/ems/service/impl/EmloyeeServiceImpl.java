package com.prog.ems.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prog.ems.dto.EmployeeDTO;
import com.prog.ems.entity.Employee;
import com.prog.ems.exception.ResourceNotFoundException;
import com.prog.ems.mapper.EmployeeMapper;
import com.prog.ems.repo.EmployeeRepo;
import com.prog.ems.service.EmployeeService;
@Service
public class EmloyeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {
		//this line of code covert employeeDTO to employee jpa entity
		Employee employee = EmployeeMapper.mapToEmployee(employeeDTO);
		//now lets store employee jpa entity into database
		Employee savedEmployee= employeeRepo.save(employee);
		
		return EmployeeMapper.mapToEmployeeDTO(savedEmployee);
	}

	@Override
	public EmployeeDTO getEmployeeById(Long employeeId) {
		Employee employee = employeeRepo.findById(employeeId)
							.orElseThrow(()->
							new ResourceNotFoundException("Employe is not exists with given id: "
							+employeeId));
		return EmployeeMapper.mapToEmployeeDTO(employee);
	}
	

}
