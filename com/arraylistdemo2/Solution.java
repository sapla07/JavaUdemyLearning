package com.arraylistdemo2;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank bank = new Bank("National Indian Bank");
	
		bank.addBranch("Mumbai");
		
		bank.addCustomer("Mumbai", "Sumeet", 54.05);
		bank.addCustomer("Mumbai", "Chirag", 65.32);
		bank.addCustomer("Mumbai", "Lata", 63.25);
		
		bank.addBranch("Thane");
		bank.addCustomer("Thane", "Girish", 125.00);
		
		
		bank.addCustomerTransaction("Mumbai", "Sumeet", 56.32);
		bank.addCustomerTransaction("Mumbai", "Sumeet", 100.32);
		bank.addCustomerTransaction("Mumbai", "Chirag", 44.32);
		
		bank.listCustomers("Mumbai", true);
		bank.listCustomers("Thane", true);
		
		bank.addBranch("Kalyan");
		
		if(!bank.addBranch("Mumbai")) {
			System.out.println("Mumbai branch already Exists");
		}
		
		if(!bank.addCustomer("Kalyan", "Sumeet", 32.62)) {
			System.out.println("Kalyan branch doesn't exist");
		}
		

	}

}
