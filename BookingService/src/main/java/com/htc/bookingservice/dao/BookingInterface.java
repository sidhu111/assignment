package com.htc.bookingservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.htc.bookingservice.entity.Bookingdetails;

public interface BookingInterface extends JpaRepository<Bookingdetails, Long> {


}
