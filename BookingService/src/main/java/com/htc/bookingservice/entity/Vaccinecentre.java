package com.htc.bookingservice.entity;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vaccinationcentredetails")
public class Vaccinecentre implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5889523456609947877L;
	
	@Id
	@GeneratedValue
	private long centreId;
	private String centreAddress;
	private long pincode;
	public Vaccinecentre() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vaccinecentre(long centreId, String centreAddress, int pincode) {
		super();
		this.centreId = centreId;
		this.centreAddress = centreAddress;
		this.pincode = pincode;
	}
	public long getCentreId() {
		return centreId;
	}
	public void setCentreId(long centreId) {
		this.centreId = centreId;
	}
	public String getCentreAddress() {
		return centreAddress;
	}
	public void setCentreAddress(String centreAddress) {
		this.centreAddress = centreAddress;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (centreId ^ (centreId >>> 32));
		result = prime * result + (int) (pincode ^ (pincode >>> 32));
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
		Vaccinecentre other = (Vaccinecentre) obj;
		if (centreId != other.centreId)
			return false;
		if (pincode != other.pincode)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "VaccinationCentre [centreId=" + centreId + ", centreAddress=" + centreAddress + ", pincode=" + pincode
				+ "]";
	}
	
	
	


}
