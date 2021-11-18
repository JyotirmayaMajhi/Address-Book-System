package com.bridgelabz.addressbook;

import java.util.Scanner;
public class AddressBook {
	private final String firstName;
	private final String lastName;
	private final String address;
	private final String cityName;
	private final String stateName;
	public final int zip;
	public final long phoneNumber;
	private final String emailID;

	public AddressBook(String firstName, String lastName, String address, String cityName, String stateName, int zip,
			long phoneNumber, String emailID) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.cityName = cityName;
		this.stateName = stateName;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.emailID = emailID;
	}
	
	public AddressBook(String firstName2, String lastName2, String address2, String cityName2, String stateName2,
			String zip2, String phoneNumber2) {
				this.firstName = "firstName";
				this.lastName = "lastname";
				this.address = "address";
				this.cityName = "city";
				this.stateName = "statename";
				this.zip = 0;
				this.phoneNumber = 0;
				this.emailID = "emailID";
		
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}

	public String getCityName() {
		return cityName;
	}

	public String getStateName() {
		return stateName;
	}

	public int getZip() {
		return zip;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}
	
	@Override
	public String toString() {
		return "AddressBook [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", cityName="
				+ cityName + ", stateName=" + stateName + ", zip=" + zip + ", phoneNumber=" + phoneNumber + "]";
	}
	public static AddressBook contactPerson() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("first name : ");
		String firstName = scanner.next();
		System.out.println("last name : ");
		String lastName = scanner.next();
		System.out.println("address : ");
		String address = scanner.next();
		System.out.println("city name : ");
		String cityName = scanner.next();
		System.out.println("state name : ");
		String stateName = scanner.next();
		System.out.println("zip : ");
		String zip = scanner.next();
		System.out.println("phone number : ");
		String phoneNumber = scanner.next();
		
		AddressBook addressBook = new AddressBook(firstName, lastName, address, cityName, stateName, zip,
				phoneNumber);
		return addressBook;
	}

	public static void main(String[] args) {
		System.out.println("welcome to the address book program");
		AddressBook addressBook =contactPerson();
		System.out.println(addressBook);
	}
}
