package com.addressBook.service;
import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	
	public static void main(String[] args) {

		System.out.println("---------Address Book---------");

		List<ContactPerson> contacts = new ArrayList<>();

		ContactPerson newContact = new ContactPerson("Tom", "Thomas", "Dighi", "Pune","Maharashtra", 411015, "9158679678", "tomthomas@gmail.com");

		contacts.add(newContact);

		System.out.println(contacts);
	}

}

