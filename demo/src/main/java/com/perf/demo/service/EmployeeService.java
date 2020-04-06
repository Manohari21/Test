package com.perf.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perf.demo.bean.Employee;
import com.perf.demo.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepo emprepo;
	
	public void saveOrUpdate(Employee emp) {
		 emprepo.save(emp);
	}
	
	public List<Employee> getAllEmployee(){
		List<Employee> rec=new ArrayList<Employee>();
		emprepo.findAll().forEach(emp1->rec.add(emp1));
		return rec;
	}
	public Employee getEmpById(int id) {
		return emprepo.findById(id).get();
	}
	public void deleteEmpById(int id) {
		emprepo.deleteById(id);
	}

}
