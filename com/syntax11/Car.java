package com.syntax11;

public class Car {

	String make;
	String model;
	String color;
	int year;
	double milage;
   
	void moveForward() {
	System.out.println("Moving forward");
	
}
void applyBreaks(){
	System.out.println("Applying breaks");
}

	public static void main(String[] args) {

	Car ayshasCar=new Car();
	ayshasCar.make="Tesla";
	ayshasCar.model="S";
	ayshasCar.color="Black";
	
	System.out.println("Ayshas Car is "+ayshasCar.make);
	System.out.println("Ayshas Car is "+ayshasCar.model);
	System.out.println("Ayshas Car is "+ayshasCar.color);
	ayshasCar.moveForward();
	ayshasCar.applyBreaks();
	}
}
