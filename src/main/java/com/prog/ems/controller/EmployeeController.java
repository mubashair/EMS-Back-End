package com.prog.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prog.ems.dto.EmployeeDTO;
import com.prog.ems.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	//Build create Employee REST API
	@PostMapping
	public ResponseEntity<EmployeeDTO> createEmployee(@RequestBody EmployeeDTO employeeDTO) {
		EmployeeDTO savedEmployee= employeeService.createEmployee(employeeDTO);
		return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
	}
	//Build get Employee REST API
	@GetMapping("{id}")
	ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable(name = "id") Long EmployeeId){
		EmployeeDTO employeeDTO = employeeService.getEmployeeById(EmployeeId);
		return ResponseEntity.ok(employeeDTO);
	}
}
