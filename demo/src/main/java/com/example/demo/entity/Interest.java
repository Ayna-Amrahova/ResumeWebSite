package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="interest")
public class Interest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="interest")
	private String interest;
	@Column(name="icon_class")
	private String iconClass;
	
	
	public Interest() {
		super();
	}


	public Interest(int id, String interest, String iconClass) {
		super();
		this.id = id;
		this.interest = interest;
		this.iconClass = iconClass;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getInterest() {
		return interest;
	}


	public void setInterest(String interest) {
		this.interest = interest;
	}


	public String getIconClass() {
		return iconClass;
	}


	public void setIconClass(String iconClass) {
		this.iconClass = iconClass;
	}


	@Override
	public String toString() {
		return "Interest [id=" + id + ", interest=" + interest + ", iconClass=" + iconClass + "]";
	}
	
	
	
	
}
