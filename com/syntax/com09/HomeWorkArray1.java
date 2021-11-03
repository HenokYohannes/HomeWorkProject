package com.syntax.com09;

public class HomeWorkArray1 {

	public static void main(String[] args) {
		
		/*Create an array of animals and store 6 elements into it. 
		 * Using 2 different loops print all elements from the array.
		 */

	String[] animals={ "Cat","Dog","Chicken","Goat","Sheep","Horse"};
	
	for(int i=0; i< animals.length;i++) {
		System.out.println(animals[i]);
	}
	
	System.out.println("----------------");
	for(String a :animals) {
		System.out.println(a);
	
	}
	
	}

}
