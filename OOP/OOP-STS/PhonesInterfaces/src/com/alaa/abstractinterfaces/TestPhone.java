package com.alaa.abstractinterfaces;

public class TestPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instantiate Phone
		
//		Phone normalPhone = new Phone("7Kbnsqdsdf", 50, "AT&T", "Riiiing Riiiing");
//		
//		normalPhone.displayInfo();
		
		Iphone IphoneProMax = new Iphone("iOS 14", 100, "Verizion", "Bizzzzzz");
		IphoneProMax.displayInfo();
		
		Android Galaxy22 = new Android("Android 16", 95, "Spring", "Diiiing");
		

	}

}
