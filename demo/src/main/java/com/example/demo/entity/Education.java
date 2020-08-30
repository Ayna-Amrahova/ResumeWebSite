package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name="education")
public class Education {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="beginning_date")
	private String beginningDate;
	@Column(name="ending_date")
	private String endingDate;
	@Column(name="specialty")
	private String specialty;
	@Column(name="information")
	private String information;
	
	
	
	public Education() {
		super();
	}



	public Education(int id, String beginningDate, String endingDate, String specialty, String information) {
		super();
		this.id = id;
		this.beginningDate = beginningDate;
		this.endingDate = endingDate;
		this.specialty = specialty;
		this.information = information;
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



	public String getSpecialty() {
		return specialty;
	}



	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}



	public String getInformation() {
		return information;
	}



	public void setInformation(String information) {
		this.information = information;
	}



	@Override
	public String toString() {
		return "Education [id=" + id + ", beginningDate=" + beginningDate + ", endingDate=" + endingDate
				+ ", specialty=" + specialty + ", information=" + information + "]";
	}
	
	
	
}
