package com.arraydemo;

import java.util.Arrays;
import java.util.Scanner;

public class MinElement {

	public static void main(String[] args) {
		
	}
	
	public static int readIntegers() {		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Elements count");
		int count = sc.nextInt();	
		sc.close();
		return count;		
	}
	
	public static int[] readElements(int count) {
		int[] array = new int[count];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers");
		for(int i=0; i<array.length;i++) {
			array[i] = sc.nextInt();
		}
		return array;
	}
	
	public static int findMin(int[] array) {
		
		int[] MinArray = Arrays.copyOf(array, array.length);
		int minEle = MinArray[0];
		for(int i=0 ; i < MinArray.length; i++) {
			if(MinArray[i] < minEle) {
				minEle = MinArray[i];
			}
		}
		
		return minEle;
		
	}
}
