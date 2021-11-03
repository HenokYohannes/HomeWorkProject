package com.syntax.class07;

public class IfElseIfConditionReviewClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 3;

		if (num> 10) {
          System.out.println("number is 10"); // Java executes top to bottom & left to right..if the first line is true
                                               // will ignore the other lies even if they are true'

		} else if (num >20) {  //---> Ture but ignored
			System.out.println("number is 10");
		} else if (num >30) {
			System.out.println("number is 30");
		} else {
			System.out.println("Unknown number");
		}
	}
}
