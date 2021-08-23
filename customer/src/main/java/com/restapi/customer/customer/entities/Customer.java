package com.restapi.customer.customer.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue
	private long id;
	private String Name;
	private String Address;
	
	public Customer(long id, String name, String address) {
		super();
		this.id = id;
		this.Name = name;
		this.Address = address;
	}
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", Name=" + Name + ", Address=" + Address + "]";
	}
	
}
