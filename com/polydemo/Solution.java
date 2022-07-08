 package com.polydemo;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car(8, "Base Car");
		System.out.println(car.startEngine());
		System.out.println(car.accelerate());
		System.out.println(car.brake());
		
		Mitsubishi mitsu = new Mitsubishi(6,"Outlander VRX 4WD");
		System.out.println(mitsu.startEngine());
		System.out.println(mitsu.accelerate());
		System.out.println(mitsu.brake());
		
		Ford ford = new Ford(6, "Ford Falcon");
		System.out.println(ford.startEngine());
		System.out.println(ford.accelerate());
		System.out.println(ford.brake());
		
		Holden holden = new Holden(6,"Holden Commodre");
		System.out.println(holden.startEngine());
		System.out.println(holden.accelerate());
		System.out.println(holden.brake());

	}

}
