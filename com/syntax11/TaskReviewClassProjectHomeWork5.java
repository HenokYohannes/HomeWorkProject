package com.syntax11;

public class TaskReviewClassProjectHomeWork5 {

	public static void main(String[] args) {
		/*
		 * Create an array of countries.
		 * While retrieving all values from an array print capital for each country.
		 * (use 2 different loops).
		 * 
		 */

		String[]countries={ "Germany", "France", "Eritrea", "Turkey" };
		
		for(String country:countries) {
			
			if (country.equals("Germany")) {
				System.out.println("Berlin");
			}else if (country.equals("France")) {
				System.out.println("Paris");
			}else if(country.equals("Eritrea")) {
				System.out.println("Asmara");
			}else {
				System.out.println("Ankara");
			}
		}
	System.out.println("------------------------------");
	for( int i=0; i<countries.length;i++) {
		
		switch (countries[i]) {
		
		case "Germany":
		System.out.println("Berlin");
		break;
		case "France":
			System.out.println("Paris");
			break;
		case "Eritrea":
			System.out.println("Asmara");
		break;
		
		case "Turkey":
		System.out.println("Ankara");
		break;
		}
	}
	
	
	}

}
