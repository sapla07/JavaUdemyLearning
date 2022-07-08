package com.polydemo;

public class Ford extends Car{

	public Ford(int cylinders, String name) {
		super(cylinders, name);
	}

	@Override
	public String startEngine() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName() + " -> startEngine()";
	}

	@Override
	public String accelerate() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName() + " -> accelerate()";
	}

	@Override
	public String brake() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName() + " -> brake()";
	}
	
	

}
