package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;




@Entity 
@Table(name="job_responsibility")
public class JobResponsibility {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="experience_id")
	private int experienceId;
	@Column(name="responsibility")
	private String responsibility;
	
	
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="experience_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    private Experience experience;
	


	public JobResponsibility() {
		super();
	}


	public JobResponsibility(int id, int experienceId, String responsibility) {
		super();
		this.id = id;
		this.experienceId = experienceId;
		this.responsibility = responsibility;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getExperienceId() {
		return experienceId;
	}


	public void setExperienceId(int experienceId) {
		this.experienceId = experienceId;
	}


	public String getResponsibility() {
		return responsibility;
	}


	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}


	@Override
	public String toString() {
		return "JobResponsibility [id=" + id + ", experienceId=" + experienceId + ", responsibility=" + responsibility
				+ "]";
	}
	
	
}
