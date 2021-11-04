package com.syntax11;

public class PhoneObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Phone Nokia=new Phone();
	
	
	Nokia.model="NokiaCityman";
	Nokia.OperatingSystem=" Symbian";
	Nokia.size=4.45;
	Nokia.price=29;
	
	Nokia.screen();
	Nokia.memory();
	
	System.out.println("----------");
	Phone iPhone=new Phone();
	
	
	iPhone.model="iPhone SX";
	iPhone.OperatingSystem=" iOS";
	iPhone.size=70.9;
	iPhone.price=699;
	
	iPhone.screen();
	iPhone.memory();

	Phone Android=new Phone();
	
	System.out.println("----------");
	
	Android.model="S21";
	Android.OperatingSystem=" Android ";
	Android.size=6.2;
	Android.price=650;
	
	Android.screen();
	Android.memory();
	
	if (!iPhone.equals(Android)) {
		
		System.out.println("I will have my Old Nokia 3310");
	}
	}

}
 

