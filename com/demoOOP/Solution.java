package com.demoOOP;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hamburger hm = new Hamburger("Basic", "Sausage", 3.56, "White");
		hm.addHamburgerAddition1("tomato",  0.27);
		hm.addHamburgerAddition2("Lettuce", 0.75);
		hm.addHamburgerAddition3("Cheese", 1.13);
		System.out.println("Total Burger price is " + hm.itemizehamburger());
		
		HealthyBurger hb = new HealthyBurger("Beacon", 5.67);
		hb.addHamburgerAddition1("Egg", 5.43);
		hb.addHealthAddition1("Lentils", 3.41);
		System.out.println("Total Burger price is " + hb.itemizehamburger());
		
		DeluxeBurger db = new DeluxeBurger();
		db.addHamburgerAddition3("Should not do this", 50.53);
		System.out.println("Total Burger price is " + db.itemizehamburger());
		
	}

}
