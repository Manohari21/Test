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
public class GeographicLocale {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int  localeid;
	private String city;
	private String state;
	private String travelOption;
	
	@ManyToOne
	@JoinColumn(name = "Emp_Resume_id")
	private Employee empid;

	public int getLocaleid() {
		return localeid;
	}

	public void setLocaleid(int localeid) {
		this.localeid = localeid;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTravelOption() {
		return travelOption;
	}

	public void setTravelOption(String travelOption) {
		this.travelOption = travelOption;
	}

	public Employee getEmpid() {
		return empid;
	}

	public void setEmpid(Employee empid) {
		this.empid = empid;
	}

	public GeographicLocale(int localeid, String city, String state, String travelOption, Employee empid) {
		super();
		this.localeid = localeid;
		this.city = city;
		this.state = state;
		this.travelOption = travelOption;
		this.empid = empid;
	}

	public GeographicLocale() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
