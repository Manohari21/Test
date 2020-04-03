package com.perfs.taq.model;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table
public class ProfessionalExperience {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int  pcid;
	private String employerName;
	
	@OneToOne(mappedBy = "pcid")
	private List<ProjectDetails> projectDetails;
	
	@ManyToOne
	@JoinColumn(name = "Emp_Resume_id")
	private Employee empid;

	public int getPcid() {
		return pcid;
	}

	public void setPcid(int pcid) {
		this.pcid = pcid;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public List<ProjectDetails> getProjectDetails() {
		return projectDetails;
	}

	public void setProjectDetails(List<ProjectDetails> projectDetails) {
		this.projectDetails = projectDetails;
	}

	public Employee getEmpid() {
		return empid;
	}

	public void setEmpid(Employee empid) {
		this.empid = empid;
	}

	public ProfessionalExperience(int pcid, String employerName, List<ProjectDetails> projectDetails, Employee empid) {
		super();
		this.pcid = pcid;
		this.employerName = employerName;
		this.projectDetails = projectDetails;
		this.empid = empid;
	}

	public ProfessionalExperience() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
