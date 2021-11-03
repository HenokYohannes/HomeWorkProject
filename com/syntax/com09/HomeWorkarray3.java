package com.syntax.com09;

public class HomeWorkarray3 {

	public static void main(String[] args) {
		// Create an array on integers and calculate the sum of all elements in an array
	
		int sum = 0;
		int [] num=new int[6];
	num[0]=30;
	num[1]=330;
	num[2]=21;
	num[3]=45;
	num[4]=30;
	num[5]=10;
	
	
	for(int i=0; i<num.length;i++ ) {
		System.out.print(num[i]+" ");
		
		
		sum +=num[i];
	
	
		
		
		
		
		
	}
	System.out.println();
	System.out.print("The sum of all elements in the array is "+sum);
	}

}
