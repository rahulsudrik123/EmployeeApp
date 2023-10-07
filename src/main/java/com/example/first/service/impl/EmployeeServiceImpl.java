package com.example.first.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.first.entity.Employee;
import com.example.first.repository.EmployeeRepo;
import com.example.first.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepo employeeRepo;

	public void saveEmployee(Employee employee) {
		employeeRepo.save(employee);
	}

	public List<Employee> getAllEmployee() {
		return employeeRepo.findAll();

	}
	
	public Optional<Employee> getEmployee(int id) {
		return employeeRepo.findById(id);
	}

}
