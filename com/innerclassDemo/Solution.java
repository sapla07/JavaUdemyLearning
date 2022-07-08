package com.innerclassDemo;

import java.util.Scanner;

public class Solution {
	
	private static Scanner sc = new Scanner(System.in);
	private static Button btnPrint = new Button("Print");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		class ClickListener implements Button.OnClickListener{
//			
//			public ClickListener() {
//				System.out.println("I've been attached");
//			}
//			
//
//			@Override
//			public void onClick(String title) {
//				System.out.println(title  + " was Clicked");
//				
//			}
//		}
		
		btnPrint.setOnClickListener(new Button.OnClickListener() {			
			@Override
			public void onClick(String title) {
				System.out.println(title  + " was Clicked");
				
			}
		});
		listen();
		
	}
	
	private static void listen() {
		boolean quit = false;
		while(!quit) {
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
				case 0:
					quit=true;
					break;
				case 1:
					btnPrint.onClick();
					break;
			}
		}
	}

}
