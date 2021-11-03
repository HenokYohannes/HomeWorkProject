package com.syntax.com09;

public class HomeWor2DArray2 {

	public static void main(String[] args) {
		// Create a 2D array or integer type where you will store odd and even numbers.

		int num[] = { 23, 50, 54, 9, 44, 66, 24, 91, 25 };

		for (int i = 0; i < num.length; i++) {

			if (num[i] % 2 == 0) {

				System.out.println("The even # are " + num[i] + " ");
			}
		}
		System.out.println("-----------------------------");
		for (int k1 = 0; k1 < num.length; k1++)

			if (num[k1] % 2 != 0) {
				System.out.println("The odd # are " + num[k1] + " ");
			}
		System.out.println("_____________________");
		System.out.println("The Total number of Array elements are " + num.length);

	}

}
