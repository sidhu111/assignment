package com.htc.bookingservice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.htc.bookingservice.dao.BookingInterface;
import com.htc.bookingservice.entity.Bookingdetails;
import com.htc.bookingservice.entity.User;
import com.htc.bookingservice.entity.Vaccinecentre;

@SpringBootTest
class BookingServiceApplicationTests {

	@Test
	void contextLoads() {
	}
	
	 @Autowired
	    private BookingInterface booking;
	    
	    	
	 
	    @Test
	    public void createdBookingDetailsareStoredornot() {
	    	
	    	List<User> users = new ArrayList<>();
	    	User user = new User(1,"sudharshan",89654321,"sudharshan@gmail.com","hyderabad",23,"male");
	    	users.add(user);
	    	List<Vaccinecentre> vaccinationcentres = new ArrayList<>();
	    	vaccinationcentres.add(vaccinationcentre);
	        Bookingdetails bookingdetails = new Bookingdetails(1,users,vaccinationcentres) ;
	        booking.save(bookingdetails);
	 
	       Assert.notNull(booking.getById(1L),"Test Success");
	 
	        
	}

}
