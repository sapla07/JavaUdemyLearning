package com.Arraylistdemo;

import java.util.Scanner;

public class Solution {
	
	private static MobilePhone mobilePhone = new MobilePhone("0039 330 4404");
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean quit = false;
		
		startPhone();
		printActions();
		while(!quit) {
			System.out.println("\nEnter action: (6 to show avaialble action)");
			int action = sc.nextInt();
			sc.nextLine();
			
			switch(action) {
				case 0: 
					System.out.println("\nShutting down...");
					quit= true;
					break;
				case 1:
					mobilePhone.printContacts();
					break;
				case 2:
					addNewContact();
					break;
				case 3:
					updateContact();
					break;
				case 4:
					removeContact();
					break;
				case 5:
					queryContact();
					break;
				case 6: 
					printActions();
					break;
					
			}
	
		}
			
	}
	
	private static void addNewContact() {
		
		System.out.println("Enter new contact name: ");
		String name = sc.nextLine();
		System.out.println("Enter new phone number: ");
		String phone = sc.nextLine();
		Contact newContact = Contact.createContact(name, phone);
		if(mobilePhone.addNewContact(newContact)) {
			System.out.println("New contact added: name = " + name + ", phone = " + phone);
		}else {
			System.out.println("Contact add, " + name + " already on file ");
		}
		
	}
	
    private static void updateContact() {
    	System.out.println("Enter existing contact name: ");
		String name = sc.nextLine();
		Contact existingContactRecord = mobilePhone.queryContact(name);
		if(existingContactRecord == null) {
			System.out.println("Contact not found.");
			return;
		}
		
		System.out.println("Enter new Contact name: ");
		String newname = sc.nextLine();
		System.out.println("Enter new phone number: ");
		String newNumber = sc.nextLine();
		Contact newContact = Contact.createContact(newname, newNumber);
		if(mobilePhone.updateContact(existingContactRecord, newContact)) {
			System.out.println("Successfully updated record");
		}else {
			System.out.println("Error updating record");
		}
    	
		
	}
    
    private static void removeContact() {
    	System.out.println("Enter existing contact name: ");
		String name = sc.nextLine();
		Contact existingContactRecord = mobilePhone.queryContact(name);
		if(existingContactRecord == null) {
			System.out.println("Contact not found.");
			return;
		}
		
		if(mobilePhone.removeContact(existingContactRecord)) {
			System.out.println("Successfully Deleted");
		}else {
			System.out.println("Error deleting contact ");
		}
	}
    
    
    private static void queryContact() {
    	System.out.println("Enter existing contact name: ");
		String name = sc.nextLine();
		Contact existingContactRecord = mobilePhone.queryContact(name);
		if(existingContactRecord == null) {
			System.out.println("Contact not found.");
			return;
		}
		
		System.out.println("name: " + existingContactRecord.getName() + " phone number is " + existingContactRecord.getPhoneNumber());
	}
	
	private static void startPhone() {
		System.out.println("starting phone....");
	}
	
	private static void printActions() {
		System.out.println("\n Available actions: \n press");
		System.out.println("0- to Shutdown \n" + 
						   "1 - to print Contacts\n" +
						   "2 - to add new contact\n" +
						   "3 - to update an existing contact\n" + 
						   "4 - to remove existing contact\n" +
						   "5 - query if an existing contact exist\n" +
						   "6 - to print a list of available actions ");
		
		System.out.println("Choose your actions: ");
	}

}
