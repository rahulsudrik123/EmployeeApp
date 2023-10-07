package com.example.first.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.first.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
