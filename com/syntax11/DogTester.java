package com.syntax11;

public class DogTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 // creating an object of Dog class
	Dog alonasDog =new Dog();
	alonasDog.name="Lexy";
	alonasDog.breed="american hound";
	alonasDog.color="Black";
	alonasDog.height=2.5;
	alonasDog.age=10;
	alonasDog.gender='M';
	
	System.out.println(" My Dog Name is"+alonasDog.name);
	System.out.println(" My Dog Breed is"+alonasDog.breed);
	System.out.println(" My Dog colors is"+alonasDog.color);
	System.out.println(" My Dog height is"+alonasDog.height);
	System.out.println(" My Dog age is"+alonasDog.age);
	System.out.println(" My Dog gender is"+alonasDog.gender);
	
	System.out.println("---------------");
	
	Dog jimmayDog=new Dog();
	jimmayDog.name="Teddy";
	jimmayDog.breed="Labrador Retriever";
	jimmayDog.color="Golden";
	jimmayDog.height=5;
	jimmayDog.age=5;
	jimmayDog.gender='M';
	
	System.out.println(" My Dog Name is"+jimmayDog.name);
	System.out.println(" My Dog Breed is"+jimmayDog.breed);
	System.out.println(" My Dog colors is"+jimmayDog.color);
	System.out.println(" My Dog height is"+jimmayDog.height);
	System.out.println(" My Dog age is"+jimmayDog.age);
	System.out.println(" My Dog gender is "+jimmayDog.gender);
	
	System.out.println("--------------------");
	
	Dog arwansDog=new Dog();
	arwansDog.name="manroe";
	
	System.out.println("Arwas Dog is "+arwansDog.name);
	
	
	}

}
