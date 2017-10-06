package com.fitness.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UserInfo")
public class UserDetails {

	   @Id @GeneratedValue
	   @Column(name = "UserId")
	   private String userId;

	   @Column(name = "FirstName")
	   private String firstName;

	   @Column(name = "LastName")
	   private String lastName;
	   
	   @Column(name = "EmailId")
	   private String emailId;
	   
	   @Column(name = "PhoneNo")
	   private String phoneNO;
	   
	   @Column(name = "Address")
	   private String address;
	   
	   @Column(name = "Gender")
	   private String gender;
	   
	   @Column(name = "Password")
	   private String password;
	   
	   @Column(name = "City")
	   private String city;

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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNO() {
		return phoneNO;
	}

	public void setPhoneNO(String phoneNO) {
		this.phoneNO = phoneNO;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	   
}
