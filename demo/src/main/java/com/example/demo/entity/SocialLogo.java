package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="social_logo")
public class SocialLogo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="img_path")
	private String imgPath;
	@Column(name="link")
	private String link;
	@Column(name="name")
	private String name;
	
	
	public SocialLogo() {
		super();
	}


	public SocialLogo(int id, String imgPath, String link, String name) {
		super();
		this.id = id;
		this.imgPath = imgPath;
		this.link = link;
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getImgPath() {
		return imgPath;
	}


	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}


	public String getLink() {
		return link;
	}


	public void setLink(String link) {
		this.link = link;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "SocialLogo [id=" + id + ", imgPath=" + imgPath + ", link=" + link + ", name=" + name + "]";
	}


	

}
