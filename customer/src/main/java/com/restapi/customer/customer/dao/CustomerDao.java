package com.restapi.customer.customer.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.customer.customer.entities.Customer;

public interface CustomerDao extends JpaRepository<Customer, Long>{
	
}
