package com.example.first.service;

import java.util.List;
import java.util.Optional;

import com.example.first.entity.Employee;

public interface EmployeeService {
	
	public void saveEmployee(Employee employee);
	public List<Employee> getAllEmployee();
	public Optional<Employee> getEmployee(int id);

}
