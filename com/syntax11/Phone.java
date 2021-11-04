package com.syntax11;

public class Phone {

	/*
	 * Create a Class “Phone”. Create 3 Objects of it: iPhone, Android, Nokia with
	 * specific attributes and behaviors.
	 */

	public String name;
	public String model;
	public String OperatingSystem;
	public double size;
	public int price;

	void screen() {
		System.out.println(model + " has screen");
	
	}
	
	void OperatingSystem() {
System.out.println(model+" has "+OperatingSystem);
		
	}
void size() {
	System.out.println(model+"has"+size );
}
void memory() {
	System.out.println(model+""+OperatingSystem +" OperS mobile cost"+" $"+price);
}



}

