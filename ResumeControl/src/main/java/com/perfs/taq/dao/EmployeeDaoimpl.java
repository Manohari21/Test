package com.perfs.taq.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.perfs.taq.model.Employee;

@Repository
public class EmployeeDaoimpl implements EmployeeDao {

	@Autowired
	private SessionFactory sessionfactory;

	@Override
	public void addEmployee(Employee employee) {
		sessionfactory.getCurrentSession().saveOrUpdate(employee);
	}

	@Override
	public List<Employee> viewAll() {
		// TODO Auto-generated method stub
		return sessionfactory.getCurrentSession().createQuery("from Employee").list();
	}

}
