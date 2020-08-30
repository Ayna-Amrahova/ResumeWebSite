package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="coding_skill")
public class CodingSkill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="skill")
	private String skill;
	@Column(name="skill_class")
	private String skillClass;
	@Column(name="percentage")
	private String percentage;
	
	
	public CodingSkill() {
		super();
	}


	public CodingSkill(int id, String skill, String skillClass, String percentage) {
		super();
		this.id = id;
		this.skill = skill;
		this.skillClass = skillClass;
		this.percentage = percentage;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getSkill() {
		return skill;
	}


	public void setSkill(String skill) {
		this.skill = skill;
	}


	public String getSkillClass() {
		return skillClass;
	}


	public void setSkillClass(String skillClass) {
		this.skillClass = skillClass;
	}


	public String getPercentage() {
		return percentage;
	}


	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}


	@Override
	public String toString() {
		return "CodingSkill [id=" + id + ", skill=" + skill + ", skillClass=" + skillClass + ", percentage="
				+ percentage + "]";
	}
	
	
	
}
