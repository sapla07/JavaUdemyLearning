package com.arraydemo;

import java.util.Scanner;

public class Solution {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myIntegers = getIntegers(5);
		int[] sorted = sortIntegers(myIntegers);
		printArray(sorted);
		

	}
	
	public static int[] getIntegers(int capacity) {
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[capacity];
		System.out.println("Enter " + capacity + " Integers values: ");
		for(int i=0; i< array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		return array;
	}

	public static void printArray(int[] array) {
		for(int i=0; i< array.length; i++) {
			System.out.println("Element " + i + " contents " + array[i]);
		}
	}
	
	public static int[] sortIntegers(int[] array) {
		int[] sortedArray = new int[array.length];
		for(int i=0; i< sortedArray.length; i++) {
			sortedArray[i] = array[i];
		}
		
		boolean flag = true;
		int temp;
		while(flag) {
			flag=false;
			for(int i=0; i< sortedArray.length-1;i++) {
				if(sortedArray[i] < sortedArray[i+1]) {
					temp = sortedArray[i];
					sortedArray[i] = sortedArray[i+1];
					sortedArray[i+1] = temp;
					flag = true;
				}
			}
		}
		
		return sortedArray;
	}
}
