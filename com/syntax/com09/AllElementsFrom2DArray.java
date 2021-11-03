package com.syntax.com09;

public class AllElementsFrom2DArray {

	public static void main(String[] args) {
		//2D array is array of arrays
		
		
		String[][] groceries= {
				
				{"banana","apple","mango"},//0
				{"Potato","tomato"}, //1
				{"milk","cheese","ayran","yougurt"}//2
				 };
	
	for (String[] grocery:groceries) {
		
		for(String g:grocery) {
		System.out.println(g);
	
	}
	
	System.out.println();
	}
	}
}
