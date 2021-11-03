package com.syntax.com09;

public class AllElements2DArrayNumbers {

	public static void main(String[] args) {
		
		int[][] numbers= {
		
				{100,200,300},
				{9,8,7}
		
		};
System.out.println("size of 2D array="+numbers.length);;

	System.out.println(numbers[1][2]);//8
	
	// get all elements
	
	for (int[] nums:numbers) {
		
		for (int n:nums) {
			
			System.out.println(n+" ");
		}
	
	System.out.println();
	
	}
	
	System.out.println(" get all elements using regular for loop");
	
	for (int i=0;i<numbers.length; i++) {
		
		for(int j=0; j<numbers[i].length; j++) {
			
			int element=numbers[i][j];
		System.out.print(element+" ");
		
		
		}
	
		System.out.println();
	}
	
	
	
	
	
	
	}
}