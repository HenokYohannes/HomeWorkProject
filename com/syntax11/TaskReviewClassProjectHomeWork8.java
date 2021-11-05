package com.syntax11;

public class TaskReviewClassProjectHomeWork8 {

	public static void main(String[] args) {
		// Write a Java Program to print the first 10 numbers of Fibonacci series.
	// 0 1 1 2 3 5 8 13 21 34.....
	
	
	int  previousNumber=0;
	int currentNumber=1;
	int sum=0;
	int numbersToPrint=10;
	
	System.out.print(previousNumber+" "); // might not need them ?
	System.out.println(currentNumber+" "); //
	
	for (int i=0;i< numbersToPrint-2;i++) {
		sum=currentNumber+previousNumber;
	System.out.print(sum+" ");
	previousNumber=currentNumber;
	currentNumber=sum;
	}
	}

}
