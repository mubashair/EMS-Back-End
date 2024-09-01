package com.prog.ems.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prog.ems.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{

}