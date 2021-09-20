package com.htc.centreservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.htc.centreservices.entity.Centredetails;
import com.htc.centreservices.service.centreserviceInterface;




@RestController
@RequestMapping("/api")
public class Centreservicecontroller {
	
	@Autowired
	private centreserviceInterface centreserviceinterface;
	
	
	
	@PostMapping("/create/centre")
	public Centredetails createCentre(@RequestBody Centredetails centredetail) {
		return centreserviceinterface.save(centredetail);
	}
	
	
	@GetMapping("/centerdetail/centre/{pincode}")
	public Centredetails getCentrebypincode(@PathVariable Long pincode) {
		return centreserviceinterface.findById(pincode).get();
	}
	
	
	
	
	
	
	

}
