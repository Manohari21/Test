package com.perfs.taq.service;

import java.util.List;

import com.perfs.taq.model.Employee;

public interface EmployeeService {
	
	public void addEmployee(Employee employee);

	public List<Employee> viewAll();

}
