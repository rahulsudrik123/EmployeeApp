package com.example.first.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "empData")
public class Employee {
	@Id // For Primary Key
	@GeneratedValue(strategy = GenerationType.AUTO) // For Auto Increment for id
	@Column(name = "id")
	private int id;

	@Nonnull
	@Column(name = "employeeId")
	private int empId;

	@Nonnull
	@Column(name = "employeeName")
	private String empName;

	@Nonnull
	@Column(name = "companyName")
	private String companyName;

	@Column(name = "departmentName")
	private String deptName;

	@Column(name = "employeeBand")
	private String empBand;

	@Column(name = "salary")
	private float salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getEmpBand() {
		return empBand;
	}

	public void setEmpBand(String empBand) {
		this.empBand = empBand;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	//Object representation in String
	@Override
	public String toString() {
		return "Emplyoee [Id:"+id+" Employee ID: "+empId+" Employee Name "+empName+" Company Name"+companyName+
				" Department Name "+deptName+" Employee Band "+empBand+" Employee Salary"+salary+"]";
	}
	

}
