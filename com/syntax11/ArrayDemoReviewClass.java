package com.syntax11;

public class ArrayDemoReviewClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	// if we have to store single value we use variable
	
	
	String name1="Sky";
	 // if we have to store multiple values of the same type we should use array
	
	
	
	String[] names;
names=new String[5];
	
	names[0]="Sky";
	names[1]="Dani";
    names[2]="Muzit";
    names[3]="Sem";
    names[4]="Kesu";
   //names[5]= "Robi";
    System.out.println(names[1]);
	// 
    
	for (int i=0;i< names.length; i++) {
	System.out.println(names[i]);
	
	}

	System.out.println("**************");
	
	for (String name:names ) {
	
	System.out.println(name);
System.out.println("***************************");
	int i=0;
	while(i<names.length) {
		
		System.out.println(names[i]);
	i++;
	
	}
	
	
	
	
	
	
	
	}
}
}