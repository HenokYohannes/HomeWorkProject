package com.syntax.com09;

public class HomeWorkArrayProject3 {

	public static void main(String[] args) {
		// Create a 2D array of integers. Develop a program which will calculate the sum
		// of even and odd numbers for that array.

		int num[] = { 20, 53, 56, 9, 44, 66, 24, 91, 25 };

		int oddSum = 0;
		int evenSum = 0;
		int i = 0;
		
		for (i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				evenSum = evenSum + num[i];

			} else {

				oddSum = oddSum + num[i];
			}
		}

		System.out.println("The sum of odd numbers =" + oddSum);
		System.out.println("The sum of even numbers =" + evenSum);

	}

}
