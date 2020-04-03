package com.perfs.taq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perfs.taq.dao.EmployeeDao;
import com.perfs.taq.model.Employee;

@Service
public class EmployeeServiceimpl implements EmployeeService{
	@Autowired
	private EmployeeDao empdao;

	@Override
	public void addEmployee(Employee employee) {
		empdao.addEmployee(employee);		
	}

	@Override
	public List<Employee> viewAll() {
		// TODO Auto-generated method stub
		return empdao.viewAll();
	}

}
