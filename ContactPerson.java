package com.addressBook.service;

public class ContactPerson {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private int zip;	
	private String phoneNumber;
	private String email;
	
	
	public ContactPerson(String firstName, String lastName, String address, String city, String state, int zip,
			String phoneNumber, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}


	@Override
	public String toString() {
		return "ContactPerson [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city="
				+ city + ", state=" + state + ", zip=" + zip + ", phoneNumber=" + phoneNumber + ", email=" + email
				+ "]";
	}
	
	
	

}
