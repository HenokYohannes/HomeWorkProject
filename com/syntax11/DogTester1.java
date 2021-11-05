package com.syntax11;

public class DogTester1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Dog1 FosterDog =new Dog1();
	
	FosterDog.name="Tyson";
	FosterDog.breed="American Bull Dog";
	FosterDog.age=2;
	FosterDog.gender='M';
	FosterDog.color="Black";
	
	System.out.println("The Foster Dog name is "+FosterDog.name);
	System.out.println("his age is "+FosterDog.age+ " and his gender is "+FosterDog.gender+" and his color is "+FosterDog.color);
	System.out.println("--------------------------");
	
	FosterDog.name="Sky";
	FosterDog.breed="Labrador Retrievers ";
	FosterDog.age=1;
	FosterDog.gender='F';
	FosterDog.color="Brown";
	
	System.out.println("The Foster Dog name is "+FosterDog.name);
	System.out.println("her age is "+FosterDog.age+ " and her gender is "+FosterDog.gender+" and her color is "+FosterDog.color);
	System.out.println("--------------------------");
	
	FosterDog.name="Bobby";
	FosterDog.breed="Siberian Husky";
	FosterDog.age=3;
	FosterDog.gender='M';
	FosterDog.color="White";
	
	System.out.println("The Foster Dog name is "+FosterDog.name);
	System.out.println("her age is "+FosterDog.age+ " and her gender is " +FosterDog.gender+" and her color is "+FosterDog.color);

	
	if(!FosterDog.equals(FosterDog)) {
		
		
	}
	
	System.out.println(" I will get a Foster CAT");
	

}
}