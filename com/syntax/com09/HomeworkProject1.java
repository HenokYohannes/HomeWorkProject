package com.syntax.com09;

public class HomeworkProject1 {

	public static void main(String[] args) {
		
		// Create a 2D array of integer values. Print the sum of all numbers.

				int[][] a= {
						{44, 12, 3, 81, 3},
						{110, 39, 2, 53},
						{72, 66, 19, 39},
							};
				int sum=0;

				for (int a1[]:a) {
					for(int a2:a1) {
						sum=sum+a2;

					}
				}
				System.out.println("The sum of all numbers is "+sum);
			}
	}


