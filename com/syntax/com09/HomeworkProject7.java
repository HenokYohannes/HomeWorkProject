package com.syntax.com09;

public class HomeworkProject7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a 2D array of integers. Develop a program which will calculate the sum of 
				//even and odd numbers for that array.

		// Create a 2D array of integers. Develop a program which will calculate the sum of 
		//even and odd numbers for that array.

		int[][] array= {
				{99, 5, 8, 96, 7, 210},
				{8, 323, 91, 60, 7, 68},
				{93, 84, 42, 58, 49, 4},
					};

		int EvenSum=0;
		int OddSum=0;

		for (int[] num:array) {
			for (int n:num) {
				if (n%2==0) {
					EvenSum=EvenSum+n;
				}else {
					OddSum=OddSum+n;
									}
										}
											}
		System.out.println("The sum of all even numbers in this array is "+EvenSum);
		System.out.println("The sum of all odd numbers in this array is "+OddSum);

	}

}
