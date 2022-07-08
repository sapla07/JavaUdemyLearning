package com.linkedlistdemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		LinkedList<String> placesToVisit = new LinkedList<>();
		addInOrder(placesToVisit, "Surat");
		addInOrder(placesToVisit, "Goa");
		addInOrder(placesToVisit, "Mumbai");
		addInOrder(placesToVisit, "Bangalore");
		addInOrder(placesToVisit, "Delhi");
		addInOrder(placesToVisit, "Kolkata");
		addInOrder(placesToVisit, "Amritsar");
		addInOrder(placesToVisit, "Srinagar");
		addInOrder(placesToVisit, "Lucknow");
		printList(placesToVisit);
		visit(placesToVisit);

	}
	
	private static void printList(LinkedList<String> linkedlist) {
		Iterator<String> i = linkedlist.iterator();
		while(i.hasNext()) {
			System.out.println("Now Visiting: " + i.next());
		}
		
		System.out.println(" ========================== ");
	}
	
	private static boolean addInOrder(LinkedList<String> linkedlist, String newCity) {
		ListIterator<String> stringListIterator = linkedlist.listIterator();
		
		while(stringListIterator.hasNext()) {
			int comparison = stringListIterator.next().compareTo(newCity);
			if(comparison == 0) {
				System.out.println(newCity + "is already included in destination");
				return false;
			}else if(comparison > 0) {
				stringListIterator.previous();
				stringListIterator.add(newCity);
				return true;
			}else if(comparison < 0) {
				//move to next
			}			
		}
		
		stringListIterator.add(newCity);
		return true;
	}
	
	private static void visit(LinkedList cities) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean goingForward = true;
		ListIterator<String> listIterator  = cities.listIterator();
		
		if(cities.isEmpty()) {
			System.out.println("No cities in iternerary");
			return;
		}else {
			System.out.println("Now visiting " + listIterator.next());
			printMenu();
		}
		
		while(!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();
			
			switch(action) {
				case 0:
					System.out.println("Holiday Vacation Over");
					quit=true;
					break;
				case 1:
					if(!goingForward) {
						if(listIterator.hasNext()) {
							listIterator.next();
						}
						goingForward = true;
					}
					if(listIterator.hasNext()) {
						System.out.println("Now Visiting: " + listIterator.next());
					}else {
						System.out.println("Reached at the end");
						goingForward = false;
					}
					break;
				case 2:
					if(goingForward) {
						if(listIterator.hasPrevious()) {
							listIterator.previous();
						}
						goingForward=false;
					}
					if(listIterator.hasPrevious()) {
						System.out.println("Now Visiting: " + listIterator.previous());
					}else {
						System.out.println("Reached at the end");
						goingForward=true;
					}
					break;
				case 3: 
					printMenu();
					break;
				 
			}
			
		}
		
	}

	private static void printMenu() {
		System.out.println("Available actions: \npress ");
		System.out.println("0 - to quit\n" + 
						"1 - go to next city\n" +
				        "2 - go to previous city \n" +
						"3 - print menu options");
	}
	

}
