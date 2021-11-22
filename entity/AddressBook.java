package com.addressBook.entity;

import java.util.ArrayList;
import java.util.List;;

public class AddressBook {
	
	public static List<ContactPerson> contacts = new ArrayList<>();

	public static List<ContactPerson> getContacts() {
		return contacts;
	}

	public static void setContacts(List<ContactPerson> contacts) {
		AddressBook.contacts = contacts;
	}

}

