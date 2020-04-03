package com.perfs.taq.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Emp_Resume")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int empid;

	private String firstName;

	private String lastName;

	private String designation;

	private String professionalOverview;

	private List<String> primaryRoles;

	private List<String> primaryTechnologies;

	private List<String> otherTechnologies;

	private List<String> keyIndustries;

	@OneToMany(mappedBy = "empid")
	private List<KeyEngagements> keyEngagements;

	private String education;
	
	@OneToMany(mappedBy = "empid")
	private List<ProfessionalCertification> professionalCertifications;

	private List<String> publications;
	
	@OneToMany(mappedBy = "empid")
	private GeographicLocale geographicLocale;
	
	@OneToMany(mappedBy = "empid")
	private List<ProfessionalExperience> professionalExperience;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getProfessionalOverview() {
		return professionalOverview;
	}

	public void setProfessionalOverview(String professionalOverview) {
		this.professionalOverview = professionalOverview;
	}

	public List<String> getPrimaryRoles() {
		return primaryRoles;
	}

	public void setPrimaryRoles(List<String> primaryRoles) {
		this.primaryRoles = primaryRoles;
	}

	public List<String> getPrimaryTechnologies() {
		return primaryTechnologies;
	}

	public void setPrimaryTechnologies(List<String> primaryTechnologies) {
		this.primaryTechnologies = primaryTechnologies;
	}

	public List<String> getOtherTechnologies() {
		return otherTechnologies;
	}

	public void setOtherTechnologies(List<String> otherTechnologies) {
		this.otherTechnologies = otherTechnologies;
	}

	public List<String> getKeyIndustries() {
		return keyIndustries;
	}

	public void setKeyIndustries(List<String> keyIndustries) {
		this.keyIndustries = keyIndustries;
	}

	public List<KeyEngagements> getKeyEngagements() {
		return keyEngagements;
	}

	public void setKeyEngagements(List<KeyEngagements> keyEngagements) {
		this.keyEngagements = keyEngagements;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public List<ProfessionalCertification> getProfessionalCertifications() {
		return professionalCertifications;
	}

	public void setProfessionalCertifications(List<ProfessionalCertification> professionalCertifications) {
		this.professionalCertifications = professionalCertifications;
	}

	public List<String> getPublications() {
		return publications;
	}

	public void setPublications(List<String> publications) {
		this.publications = publications;
	}

	public GeographicLocale getGeographicLocale() {
		return geographicLocale;
	}

	public void setGeographicLocale(GeographicLocale geographicLocale) {
		this.geographicLocale = geographicLocale;
	}

	public List<ProfessionalExperience> getProfessionalExperience() {
		return professionalExperience;
	}

	public void setProfessionalExperience(List<ProfessionalExperience> professionalExperience) {
		this.professionalExperience = professionalExperience;
	}

	public Employee(int empid, String firstName, String lastName, String designation, String professionalOverview,
			List<String> primaryRoles, List<String> primaryTechnologies, List<String> otherTechnologies,
			List<String> keyIndustries, List<KeyEngagements> keyEngagements, String education,
			List<ProfessionalCertification> professionalCertifications, List<String> publications,
			GeographicLocale geographicLocale, List<ProfessionalExperience> professionalExperience) {
		super();
		this.empid = empid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.designation = designation;
		this.professionalOverview = professionalOverview;
		this.primaryRoles = primaryRoles;
		this.primaryTechnologies = primaryTechnologies;
		this.otherTechnologies = otherTechnologies;
		this.keyIndustries = keyIndustries;
		this.keyEngagements = keyEngagements;
		this.education = education;
		this.professionalCertifications = professionalCertifications;
		this.publications = publications;
		this.geographicLocale = geographicLocale;
		this.professionalExperience = professionalExperience;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
