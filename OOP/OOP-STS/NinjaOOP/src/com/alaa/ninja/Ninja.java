package com.alaa.ninja;

public class Ninja {
	// Member variables
	private String name;
	private String weapon;
	private int powerLevel;
	private int health;

	// Empty Constructor
	public Ninja() {
	}

	// CONSTRUCTOR
	public Ninja(String name, String weapon, int powerLevel, int health) {
		this.name = name;
		this.weapon = weapon;
		this.powerLevel = powerLevel;
		this.health = health;
	}
	
	// Methods
		public void displayStats() {
			
			System.out.println(String.format("Name: %s \n weapon: %s \n PowerLevel: %d \n ", this.getName(), this.getWeapon(), this.getPowerLevel()));
		}
		
		public void attack(Ninja enemy) {
			System.out.println("[Ninja]");
			System.out.println(this.getName() + " is attacking " + enemy.getName());
			enemy.setHealth(enemy.getHealth() - this.getPowerLevel());
			System.out.println(enemy.getName() + " now has " + enemy.getHealth() + " hp left!!");

		}

	// Getters & Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public int getPowerLevel() {
		return powerLevel;
	}

	public void setPowerLevel(int powerLevel) {
		this.powerLevel = powerLevel;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

}
