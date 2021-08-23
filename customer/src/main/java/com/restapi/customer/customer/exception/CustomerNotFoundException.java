package com.restapi.customer.customer.exception;

public class CustomerNotFoundException extends Exception {
	private Long Id;
	public CustomerNotFoundException(Long Id) {
		super(String.format("Customer is not found with id: '%s'", Id));
	}
}
