package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contact")
public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="icon_class")
	private String iconClass;
	@Column(name="title")
	private String title;
	@Column(name="info")
	private String info;
	
	
	
	public Contact() {
		super();
	}

	
	public Contact(int id, String iconClass, String title, String info) {
		super();
		this.id = id;
		this.iconClass = iconClass;
		this.title = title;
		this.info = info;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getIconClass() {
		return iconClass;
	}


	public void setIconClass(String iconClass) {
		this.iconClass = iconClass;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getInfo() {
		return info;
	}


	public void setInfo(String info) {
		this.info = info;
	}


	@Override
	public String toString() {
		return "Contact [id=" + id + ", iconClass=" + iconClass + ", title=" + title + ", info=" + info + "]";
	}
	
	
	
	

}
