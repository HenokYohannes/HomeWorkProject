package com.syntax11;

public class TaskReviewClassProjectHomeWork2 {

	public static void main(String[] args) {
		/*Create a 2D array or integer type where you will store odd and even numbers. 
		 * Develop 
		 * a program which will identify/print the even numbers only.
		  * 
		 */

		int[][] numbers={{3,14,5,7},{8,11,13,20},{15,8,12,15}};
	
	int oddSum=0;
	int evenSum=0;	
		for (int i=0; i<numbers.length;i++) {
		
		for (int j=0;j<numbers[i].length;j++) {
		if (numbers [i][j] %2==0) {
		evenSum+=numbers[i][j];
			
	
		}else {
			oddSum+=numbers[i][j];
		}
		}
	}
	System.out.println("Sum of even numbers "+evenSum);
	System.out.println("sum of odd numbers "+oddSum);
	}
}
