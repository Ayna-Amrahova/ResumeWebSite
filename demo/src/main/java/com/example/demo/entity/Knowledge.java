package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="knowledge")
public class Knowledge {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="knowledge")
	private String knowledge;
	
	
	public Knowledge() {
		super();
	}


	public Knowledge(int id, String knowledge) {
		super();
		this.id = id;
		this.knowledge = knowledge;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getKnowledge() {
		return knowledge;
	}


	public void setKnowledge(String knowledge) {
		this.knowledge = knowledge;
	}


	@Override
	public String toString() {
		return "Knowledge [id=" + id + ", knowledge=" + knowledge + "]";
	}
	
	

}
