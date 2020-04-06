package com.perf.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.perf.demo.bean.Employee;
import com.perf.demo.service.EmployeeService;

@RestController
public class EmpController {

	@Autowired
	EmployeeService empservice;

	@PostMapping("/insert")
	private int createEmployee(@RequestBody Employee employee) {

		empservice.saveOrUpdate(employee);
		return employee.getId();
	}

	@GetMapping("/viewall")
	private List<Employee> getAllEmp() {
		return empservice.getAllEmployee();

	}

	@GetMapping("/viewemployee/{id}")
	private Employee getemployee(@PathVariable("id") int id) {
		return empservice.getEmpById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	private void deleteEmpId(@PathVariable("id") int id) {
		empservice.deleteEmpById(id);
	}
}
