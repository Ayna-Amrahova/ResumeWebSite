package com.example.demo.entity;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="experience")
public class Experience {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="beginning_date")
	private String beginningDate;
	@Column(name="ending_date")
	private String endingDate;
	@Column(name="position")
	private String position;
	@Column(name="company")
	private String company;
	@Column(name="department")
	private String department;
	
	
	
	@OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY, mappedBy = "experience")
	public Collection<JobResponsibility> jobRes;

	
	
	public Experience() {
		super();
	}


	public Experience(int id, String beginningDate, String endingDate, String position, String company,
			String department) {
		super();
		this.id = id;
		this.beginningDate = beginningDate;
		this.endingDate = endingDate;
		this.position = position;
		this.company = company;
		this.department = department;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getBeginningDate() {
		return beginningDate;
	}


	public void setBeginningDate(String beginningDate) {
		this.beginningDate = beginningDate;
	}


	public String getEndingDate() {
		return endingDate;
	}


	public void setEndingDate(String endingDate) {
		this.endingDate = endingDate;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	@Override
	public String toString() {
		return "Experience [id=" + id + ", beginningDate=" + beginningDate + ", endingDate=" + endingDate
				+ ", position=" + position + ", company=" + company + ", department=" + department + "]";
	}
	
	
	
}
