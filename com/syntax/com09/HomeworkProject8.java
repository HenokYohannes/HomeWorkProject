package com.syntax.com09;

public class HomeworkProject8 {

	public static void main(String[] args) {
		

		// Create an array of countries. While retrieving all values from an array print capital for each country.
				//(use 2 different loops).

				String[][] CountryCapitals= {
						{"America", "Germany", "Canada", "Italia"},
						{"Washington", "Berlin", "Toronto", "Rome"},
				                               };

				for (int i=0;i<CountryCapitals.length/2;i++) {
					for(int j=0;j<CountryCapitals[i].length;j++) {
						System.out.println(CountryCapitals[i][j]+" - "+CountryCapitals[i+1][j]);
					}
				}
					System.out.println("---------------------2nd Loop---------------------------------");
					int i=0;
					int j=0;
					while (i<CountryCapitals.length/2) {
						while(j<CountryCapitals[i].length) {
							System.out.println(CountryCapitals[i][j]+" - "+CountryCapitals[i+1][j]);
							j++;
						}
						i++;
	
	}


}
}