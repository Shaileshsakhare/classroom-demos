package com.brillio.training.entity;

public class Customer {
	
	//fields will be initialized by default to 0 or null
	private int customerId;
	private String firstname;
	private String lastName;

	private Address address; // Has-A relationship (aggregation)

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getAddress() {
		return address;
	}

	public Customer(int customerId, String firstname, String lastName) {
		this.customerId = customerId;
		this.firstname = firstname;
		this.lastName = lastName;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void print() {
		System.out.println("Id    " + customerId);
		System.out.println("Name  " + firstname + " " + lastName);
		if (address != null) {
			address.print();
		}
	}
}
