package com.addressBook.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.addressBook.entity.AddressBook;
import com.addressBook.entity.ContactPerson;

public class AddressBookMain {
	public static void main(String[] args) {

		System.out.println("---------Address Book---------");
		Scanner sc=new Scanner(System.in);

		List<ContactPerson> contacts = AddressBook.getContacts();
		AddressBookServices addnew = new AddressBookServices();

		addnew.addContact();
		for (ContactPerson contact : contacts) {
			System.out.println(contact);
		}
		while (true) {
			System.out.println("Enter your choice:\n 1. Add Contact \n 2.Edit Contact \n 3.Delete \n 4.Exit ");
			int choice= sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the contact detais to add in the Address Book: ");
				addnew.addContact();
				
				break;
			case 2:
				System.out.println("Enter the detais to edit: ");
				addnew.editContact();
				
				break;

			case 3:
				System.out.println("Enter contact detais to delete: ");
				addnew.deleteContact();
				break;

			case 4:
				System.out.println("contact list of address book: ");
				
				for (ContactPerson contact : contacts) {
					System.out.println(contact);
				}
				System.out.println("Exited : ");
				sc.close();
				return;

			}
		}
		
	}
}