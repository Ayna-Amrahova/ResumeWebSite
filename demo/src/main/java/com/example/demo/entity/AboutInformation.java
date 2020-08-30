package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="about_information")
public class AboutInformation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="title")
	private String title;
	@Column(name="img_path")
	private String imgPath;
	@Column(name="text")
	private String text;
	@Column(name="age")
	private int age;
	@Column(name="phone")
	private String phone;
	@Column(name="address")
	private String address;
	@Column(name="email")
	private String email;
	@Column(name="info_age")
	private String infoAge;
	@Column(name="info_phone")
	private String infoPhone;
	@Column(name="info_email")
	private String infoEmail;
	@Column(name="info_address")
	private String infoAddress;
	
	public AboutInformation() {
		super();
	}


	public AboutInformation(int id, String title, String imgPath, String text, int age, String phone, String address,
			String email, String infoAge, String infoPhone, String infoEmail, String infoAddress) {
		super();
		this.id = id;
		this.title = title;
		this.imgPath = imgPath;
		this.text = text;
		this.age = age;
		this.phone = phone;
		this.address = address;
		this.email = email;
		this.infoAge = infoAge;
		this.infoPhone = infoPhone;
		this.infoEmail = infoEmail;
		this.infoAddress = infoAddress;
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getImgPath() {
		return imgPath;
	}


	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getInfoAge() {
		return infoAge;
	}


	public void setInfoAge(String infoAge) {
		this.infoAge = infoAge;
	}


	public String getInfoPhone() {
		return infoPhone;
	}


	public void setInfoPhone(String infoPhone) {
		this.infoPhone = infoPhone;
	}


	public String getInfoEmail() {
		return infoEmail;
	}


	public void setInfoEmail(String infoEmail) {
		this.infoEmail = infoEmail;
	}


	public String getInfoAddress() {
		return infoAddress;
	}


	public void setInfoAddress(String infoAddress) {
		this.infoAddress = infoAddress;
	}


	@Override
	public String toString() {
		return "AboutInformation [id=" + id + ", title=" + title + ", imgPath=" + imgPath + ", text=" + text + ", age="
				+ age + ", phone=" + phone + ", address=" + address + ", email=" + email + "]";
	}
	

}
