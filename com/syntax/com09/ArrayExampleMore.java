package com.syntax.com09;

import java.util.Scanner;

public class ArrayExampleMore {

	public static void main(String[] args) {
	
		
		
		// i want to create an array & store elements using Scanner
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println(" Please enter how many elements you want to store inside array of cars");
		
		int size=scan.nextInt();
		
	String[] cars=new String[size];
	// storin elements inside an array of cars
	for (int i=0; i<cars.length; i++) {    // i<size
		System.out.println("Please enter your cars");
	cars[i] =scan.next();
	
	}
	
	//retrieve all stored elements
	
	for(String car:cars) {
		System.out.println(car+" ");
	}
	}
		
}
