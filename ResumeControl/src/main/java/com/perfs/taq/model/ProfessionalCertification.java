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
public class ProfessionalCertification {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int  pcid;
	private String certificationName;
	private String certifiedBy;
	
	@ManyToOne
	@JoinColumn(name = "Emp_Resume_id")
	private Employee empid;

	public int getPcid() {
		return pcid;
	}

	public void setPcid(int pcid) {
		this.pcid = pcid;
	}

	public String getCertificationName() {
		return certificationName;
	}

	public void setCertificationName(String certificationName) {
		this.certificationName = certificationName;
	}

	public String getCertifiedBy() {
		return certifiedBy;
	}

	public void setCertifiedBy(String certifiedBy) {
		this.certifiedBy = certifiedBy;
	}

	public Employee getEmpid() {
		return empid;
	}

	public void setEmpid(Employee empid) {
		this.empid = empid;
	}

	public ProfessionalCertification(int pcid, String certificationName, String certifiedBy, Employee empid) {
		super();
		this.pcid = pcid;
		this.certificationName = certificationName;
		this.certifiedBy = certifiedBy;
		this.empid = empid;
	}

	public ProfessionalCertification() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	}
