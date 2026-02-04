package com.ibm.springboot.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ibm.springboot.model.Employee;
import com.ibm.springboot.repositories.EmployeeRepository;

@Service
public class EmployeeServiceImpl {

	private final EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}
	
}
