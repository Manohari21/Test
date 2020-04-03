package com.perfs.taq.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class ProjectDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int projectid;
	private String projectNo;
	private String clientName;
	private String domainName;
	private String teamSize;
	private String startDate;
	private String endDate;
	private String environment;
	private String role;
	private List<String> responsibilities;
	private List<String> businessValues;
	@OneToOne
	@JoinColumn(name = "ProfessionalExperience_pcid")
	private ProfessionalExperience pcid;
	public int getProjectid() {
		return projectid;
	}
	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}
	public String getProjectNo() {
		return projectNo;
	}
	public void setProjectNo(String projectNo) {
		this.projectNo = projectNo;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getDomainName() {
		return domainName;
	}
	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}
	public String getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(String teamSize) {
		this.teamSize = teamSize;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public List<String> getResponsibilities() {
		return responsibilities;
	}
	public void setResponsibilities(List<String> responsibilities) {
		this.responsibilities = responsibilities;
	}
	public List<String> getBusinessValues() {
		return businessValues;
	}
	public void setBusinessValues(List<String> businessValues) {
		this.businessValues = businessValues;
	}
	public ProfessionalExperience getPcid() {
		return pcid;
	}
	public void setPcid(ProfessionalExperience pcid) {
		this.pcid = pcid;
	}
	public ProjectDetails(int projectid, String projectNo, String clientName, String domainName, String teamSize,
			String startDate, String endDate, String environment, String role, List<String> responsibilities,
			List<String> businessValues, ProfessionalExperience pcid) {
		super();
		this.projectid = projectid;
		this.projectNo = projectNo;
		this.clientName = clientName;
		this.domainName = domainName;
		this.teamSize = teamSize;
		this.startDate = startDate;
		this.endDate = endDate;
		this.environment = environment;
		this.role = role;
		this.responsibilities = responsibilities;
		this.businessValues = businessValues;
		this.pcid = pcid;
	}
	public ProjectDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
