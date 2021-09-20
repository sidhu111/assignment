package com.htc.userservice.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.htc.userservice.entity.Userdetails;



public interface UserserviceInterface extends JpaRepository<Userdetails, Long>  {

}
