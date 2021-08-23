package com.restapi.customer.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.customer.customer.dao.CustomerDao;
import com.restapi.customer.customer.entities.Customer;
import com.restapi.customer.customer.exception.CustomerNotFoundException;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerDao customerDao;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to customer application";
	}
	
	@GetMapping("/customers")
	public List<Customer> getCustomers(){
		return customerDao.findAll();
	}
	
	@GetMapping("/customers/{customerId}")
	public Customer getCustomer(@PathVariable(value = "customerId") Long customerId) throws CustomerNotFoundException{
		return this.customerDao.findById(customerId).orElseThrow(()-> new CustomerNotFoundException(customerId));
	}
	
	@PostMapping("/customers")
	public Customer addCustomer(@RequestBody Customer customer) {
		return this.customerDao.save(customer);
	}
}
