package com.bridgelabz.addressbook;

import java.util.Scanner;
public class Contact {
	
	public static AddressBook contactPerson() {

		Scanner sc = new Scanner(System.in);
		System.out.println("first name : ");
		String firstName = sc.next();
		System.out.println("last name : ");
		String lastName = sc.next();
		System.out.println("address : ");
		String address = sc.next();
		System.out.println("city name : ");
		String cityName = sc.next();
		System.out.println("state name : ");
		String stateName = sc.next();
		System.out.println("zip : ");
		String zip = sc.next();
		System.out.println("phone number : ");
		String phoneNumber = sc.next();
		AddressBook addressBook = new AddressBook(firstName, lastName, address, cityName, stateName, zip, phoneNumber);
		return addressBook;
	}

	public AddressBook updateDetails(String name,AddressBook addressBook) {
		
		if (addressBook.getFirstName().equals(name)) {
			addressBook = contactPerson();
		}
		return addressBook;
	}

	public static void main(String[] args) {

		System.out.println("welcome to the address book program");
		AddressBook addressBook = contactPerson();
		
		System.out.println(addressBook);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a name");
		String name = sc.next();
		
		Contact contactPerson = new Contact();
		addressBook = contactPerson.updateDetails(name,addressBook);
		System.out.println(addressBook);
	}
}
