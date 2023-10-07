package com.example.first.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.first.bean.EmployeeResponce;
import com.example.first.entity.Employee;
import com.example.first.service.EmployeeService;

@RestController	

public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/save")
	
	public void saveEmployee(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
		
	}
	
	@GetMapping("/getall")
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployee();
		
	}
	@GetMapping("/getbyid/{id}")
	public EmployeeResponce getEmployee(@PathVariable int id){
		Optional<Employee> e= employeeService.getEmployee(id);
		Employee emp=e.get();
		EmployeeResponce employeeResponce=new EmployeeResponce();
		employeeResponce.setId(emp.getId());
		employeeResponce.setCompanyName(emp.getCompanyName());
		employeeResponce.setName(emp.getEmpName());
		return employeeResponce;
		
	}
	
	@GetMapping("/getbyidd/{id}")
	public Optional<Employee> getEmployee1(@PathVariable int id){
		return employeeService.getEmployee(id);
	}
	
	
	

}
