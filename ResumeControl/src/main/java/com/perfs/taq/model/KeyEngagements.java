package com.perfs.taq.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table
public class KeyEngagements {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int keyid;
	
	private String companyName;

	private String designation;

	private String description;
	
	@ManyToOne
	@JoinColumn(name = "Emp_Resume_id")
	private Employee empid;

	public int getKeyid() {
		return keyid;
	}

	public void setKeyid(int keyid) {
		this.keyid = keyid;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Employee getEmpid() {
		return empid;
	}

	public void setEmpid(Employee empid) {
		this.empid = empid;
	}

	public KeyEngagements(int keyid, String companyName, String designation, String description, Employee empid) {
		super();
		this.keyid = keyid;
		this.companyName = companyName;
		this.designation = designation;
		this.description = description;
		this.empid = empid;
	}

	public KeyEngagements() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	}
