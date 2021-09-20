package com.htc.bookingservice.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.htc.bookingservice.entity.Bookingdetails;

@Service
@FeignClient(url = "http://localhost:8091/vaccinecentre-management",name="vaccinecentre-management")

public interface VaccinecenterInterface {

	
	@GetMapping("/api/vaccinations/{pincode}")
	Bookingdetails getvaccinationcentresById(@PathVariable("pincode") Long pincode);
	
	@GetMapping("/api/vaccinationdetails/{centreId}")
	Bookingdetails getvaccinationcentresBycentreId(@PathVariable("centreId") Long centreId);


}
