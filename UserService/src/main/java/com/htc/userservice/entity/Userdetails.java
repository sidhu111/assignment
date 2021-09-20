package com.htc.userservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userservice")
public class Userdetails {
	
	
	@Id
	private long phoneNumber;
	private String userName;
	private long age;
	private String gender;
	private String emailAddress;	
	
	

	public Userdetails() {
		super();
		// TODO Auto-generated constructor stub
	}


	


	


	public Userdetails(long phoneNumber, String userName, long age, String gender, String emailAddress) {
		super();
		this.phoneNumber = phoneNumber;
		this.userName = userName;
		this.age = age;
		this.gender = gender;
		this.emailAddress = emailAddress;
	}








	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public long getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public long getAge() {
		return age;
	}


	public void setAge(long age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Userdetails [phoneNumber=" + phoneNumber + ", userName=" + userName + ", age=" + age + ", gender="
				+ gender + ", emailAddress=" + emailAddress + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (phoneNumber ^ (phoneNumber >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Userdetails other = (Userdetails) obj;
		if (phoneNumber != other.phoneNumber)
			return false;
		return true;
	}


	

	
}
