package com.syntax.com09;

import java.util.Scanner;

public class HomeWorkArrayProject {

	public static void main(String[] args) {
		/*Create an array on double values using scanner and calculate the 
		 * sum of all stored elements in that array.
		 */
	
		Scanner input=new Scanner(System.in);
		System.out.println("How many elements do you want to have?");
		int size=input.nextInt();
		double sum=0;

		double[] num= new double[size];

		for(int i=0;i<num.length;i++) {
			System.out.println("Enter your numbers:");
			num[i]=input.nextDouble();
			sum=sum+num[i];
		}
		System.out.println("The sum of all your double array number  is "+sum);
	}


	
	}
	
	 
	
	
	
	


