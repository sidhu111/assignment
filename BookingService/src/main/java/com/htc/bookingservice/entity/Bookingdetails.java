package com.htc.bookingservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bookingdetails")
public class Bookingdetails {
	
	@Id
	private long bookinId;
	
	

}
