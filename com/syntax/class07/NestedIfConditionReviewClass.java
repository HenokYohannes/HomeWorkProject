package com.syntax.class07;

public class NestedIfConditionReviewClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String month="Jan";
	int day=2;
	
	if(month.equals("Jan")) { // you can put IgnoreCase if you want to write Jan=jan if not This is not Jan will be printed
		if (day==1) {
			System.out.println("This is the first week of Jan");
		}
	}else {
		System.out.println("This is not Jan");
	}
	
	System.out.println("code after nested if condition");
	}

}
