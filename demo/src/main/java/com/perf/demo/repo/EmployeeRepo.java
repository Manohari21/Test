package com.perf.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.perf.demo.bean.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
