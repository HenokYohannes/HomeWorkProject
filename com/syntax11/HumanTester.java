package com.syntax11;

public class HumanTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human tamana=new Human();
		tamana.name="Tamana";
		tamana.age=16;
		tamana.height=5.0;
	    tamana.weight=30;
	    tamana.gender='F';
	    tamana.bloodType="A+";
	
	tamana.eat();
	tamana.sleep();
	tamana.walk();
	
	Human sebastain=new Human();
	sebastain.name="sebastain";
	sebastain.age=18;
	sebastain.height=6.2;
	sebastain.gender='M';
	sebastain.bloodType="A-";
	
	sebastain.eat();
	sebastain.sleep();
	sebastain.walk();
	sebastain.sendMemes();
	System.out.println(sebastain.age);
	
	
	
	
	}

}
