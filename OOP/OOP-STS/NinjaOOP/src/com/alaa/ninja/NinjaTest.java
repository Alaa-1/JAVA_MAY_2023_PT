package com.alaa.ninja;

public class NinjaTest {

	public static void main(String[] args) {
		
		// Instantiate Ninja
		Ninja leo = new Ninja("Leonardo", "Sword", 450, 900);
		Ninja villan = new Ninja("Shredder", "claws", 999, 1500);
		
//		leo.displayStats();
//		leo.attack(villan);
		
		//Instantiate Sensei
		
		Sensei oogway = new Sensei("oogway", "staff", 9999, 1000, "This is why we call it, present", 3);
		oogway.displayStats();
		oogway.attack(villan);
	}

}
