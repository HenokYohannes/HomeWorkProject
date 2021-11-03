package com.syntax.com09;

public class HomeWorkArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//*Create an array to store double values and then print those in reverse order
	 
	
	double [] val= {10.90,20.11,11.99,12.92,2.99};
		
	for (int  i=val.length-1; i>=0; i--) {
		System.out.println(val[i]+" ");
	
	}  // comment---> when I enter 12.90 or 20.10 with 0 at the end it shows (12.9 & 20.1 ) it ignores the 0
	   // if it's casting happening why .99 is not ignored ?
	}
	
	
	}


