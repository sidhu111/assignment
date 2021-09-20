package com.htc.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.htc.userservice.entity.Userdetails;
import com.htc.userservice.service.UserserviceInterface;



@RestController
@RequestMapping("/api")
public class Userservicecontroller {
	
	
	@Autowired
	private UserserviceInterface userserviceinterface;
	
	
	@PostMapping("/adduser") 
	public Userdetails createUserdetail(@RequestBody Userdetails userdetail) {
		   
		 return userserviceinterface.save(userdetail);
	}
	
	
	
	
	@GetMapping("/userservice/{phoneNumber}") 
	public Userdetails getUserByphoneno(@PathVariable Long phoneNumber) {
		Userdetails userdetail =null;
	
		userdetail=userserviceinterface.findById(phoneNumber).get();
		return userdetail;
	}
	

}
