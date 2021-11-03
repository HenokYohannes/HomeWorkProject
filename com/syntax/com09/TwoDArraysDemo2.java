package com.syntax.com09;

public class TwoDArraysDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// let's create an array of groceries
	
	String[][] groceries= {
			
			{"banana","apple","mango"},//0
			{"Potato","tomato"}, //1
			{"milk","cheese","ayran","yougurt"}//2
			 };
	
	System.out.println(groceries.length);
	System.out.println(groceries[2][3]); //yogurt
	
	// if i want to find how many elements my 1 array has
	 
	System.out.println("# of elements inside 1 array="+groceries[0].length);
	
	System.out.println("# of elements inside 1 array="+groceries[1].length);
	
	System.out.println("# of elements inside 1 array="+groceries[2].length);
	
	System.out.println("-------------------");
	
	//how do we get elements 
	
	int total=0;
	
	
	
	for(int i=0;i<groceries.length; i++) { // iterates over arrays or rows
		
		for(int j=0; j<groceries[i].length;j++) {// iterates over elements of each single array or rows
			
			System.out.print(groceries[i][j]+" ");
		total++;
		}
	System.out.println();
	}
	System.out.println("-----------------------------------");
	System.out.println(total);
	}

}
