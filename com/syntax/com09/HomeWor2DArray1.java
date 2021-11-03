package com.syntax.com09;

public class HomeWor2DArray1 {

	public static void main(String[] args) {
		// Create a 2D array of integer values. Print the sum of all numbers.

	int[][]num= {
			
			{10,12,25},
			{15,20,8}
	};
	int sum=0;
	for(int i=0;i<num.length;i++) {
		for (int j=0; j<num[i].length;j++) {
			
			System.out.println(num[i][j]+" ");
			
			sum+=num[i][j];
		
			
		}
		
		System.out.println("-------------------");	
	}
	
	System.out.println("The sum of all 2D arrays are="+ sum);
	
	}

}
