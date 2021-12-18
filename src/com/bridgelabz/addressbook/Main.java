package com.bridgelabz.addressbook;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		MultipleAddressBook books = new MultipleAddressBook();
		
		System.out.println("Add new AddressBook \n(Yes/No)");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		while (str.equals("yes")) {
			books.newAddressBook();
			System.out.println("Add new AddressBook \n(Yes/No)");
			str = sc.next();
		}
		books.displayBook();
		
//		System.out.println("Enter\n1.Add\n2.Read\n3.Exit");
//		int read;
//		read = sc.nextInt();
//		switch (read) {
//		case 1:
//			books.addAddressBook();
//			break;
//		case 2:
//			System.out.println("Enter book");
//			
//		case 3:
//			
//
//		
	}

}
