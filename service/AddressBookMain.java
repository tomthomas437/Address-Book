package com.addressBook.service;
import java.util.ArrayList;
import java.util.List;
import com.addressBook.entity.ContactPerson;

public class AddressBookMain {
	public static void main(String[] args) {

		System.out.println("---------Address Book---------");

		List<ContactPerson> contacts = new ArrayList<>();
		AddressBookServices addnew = new AddressBookServices();

		ContactPerson newContact = new ContactPerson("Tom", "Thomas", "Dighi", "Pune","Maharashtra", 411015, 999997899, "tomthomas@gmail.com");

		contacts.add(newContact);
		addnew.addContact(contacts);

		System.out.println(contacts);

}
}
