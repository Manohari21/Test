package com.perfs.taq.dao;

import java.util.List;

import com.perfs.taq.model.Employee;

public interface EmployeeDao {
	
	public void addEmployee(Employee employee);

	public List<Employee> viewAll();

}
