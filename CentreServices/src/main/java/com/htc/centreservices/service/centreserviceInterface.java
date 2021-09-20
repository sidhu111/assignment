package com.htc.centreservices.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.htc.centreservices.entity.*;

@Repository
public interface centreserviceInterface extends JpaRepository<Centredetails, Long> {

}
