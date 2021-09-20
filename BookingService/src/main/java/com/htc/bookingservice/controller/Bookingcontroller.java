package com.htc.bookingservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.htc.bookingservice.dao.BookingInterface;
import com.htc.bookingservice.dao.VaccinecenterInterface;
import com.htc.bookingservice.entity.Bookingdetails;

@RestController("/api")
public class Bookingcontroller {

	 
	 @Autowired
	 private VaccinecenterInterface vaccinationcentres;
	 
	 @Autowired
	 private BookingInterface bookinginterface;
	 
	 @GetMapping("/centresbypincode/{pincode}")
		Bookingdetails getVaccinationcentrebyPincode(@PathVariable long pincode)
		{
		 
		 Bookingdetails bookingdetails =null;
		 bookingdetails=vaccinationcentres.getvaccinationcentresById(pincode);
		 
			return bookingdetails;
			
		}
	 
	 @GetMapping("/centres/{centreId}")
	 Bookingdetails getVaccinationcentrebyId(@PathVariable Long centreId)
		{
		 Bookingdetails bookings =null;
		 bookings=vaccinationcentres.getvaccinationcentresBycentreId(centreId);
			return bookings;
			
		}
	 
	 @PostMapping("/bookings")
		Bookingdetails createBookingDetails(@RequestBody Bookingdetails bookingdetails)
		{
			return bookinginterface.save(bookingdetails);
			
		}
		
	 
	
}
