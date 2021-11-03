package com.syntax.com09;

public class HomeworkProject6 {

	public static void main(String[] args) {
		
		// Write a java program to find the second largest number in the array?

				int[] array= {780, 153, 132, 456, 2004,1835, 47, 620, 1043,1998,};
				int l=array.length;
				int larg=0;
				int larg2=0;

				for(int i=0;i<l;i++) {
					if(array[i]>larg) {
						larg=array[i];
					}
				}

				for (int i=0;i<l;i++ ) {
						if (array[i]>larg2 && array[i]<larg) {
								larg2=array[i];
							} 
				}	

				System.out.println("The Largest number in the array is "+larg);
				System.out.println("The Second Largest number in the array is "+larg2);
	
	}

}
