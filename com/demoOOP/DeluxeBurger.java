package com.demoOOP;

public class DeluxeBurger extends Hamburger{

	public DeluxeBurger() {
		super("Deluxe", "Sausage & Beacon", 14.54, "White");
		super.addHamburgerAddition1("Chips", 2.75);
		super.addHamburgerAddition2("Drink", 1.81);		
	}

	@Override
	public void addHamburgerAddition1(String name, double price) {
		
		System.out.println("Cannot not add additona items to a deluxe Burger");
	}

	@Override
	public void addHamburgerAddition2(String name, double price) {
		
		System.out.println("Cannot not add additonal items to a deluxe Burger");
	}

	@Override
	public void addHamburgerAddition3(String name, double price) {
	
		System.out.println("Cannot not add additonal items to a deluxe Burger");
	}

	@Override
	public void addHamburgerAddition4(String name, double price) {
		
		System.out.println("Cannot not add additonal items to a deluxe Burger");
	}
 
	
	
}
