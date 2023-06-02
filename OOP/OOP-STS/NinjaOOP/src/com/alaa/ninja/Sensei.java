package com.alaa.ninja;

public class Sensei extends Ninja {
	// Member Variables
	private String wisdom;
	private int damageMultiplier;
	
	
	
	
	public Sensei(String name, String weapon, int powerLevel, int health, String wisdom, int damageMultiplier) {
		super(name,weapon, powerLevel, health) ;
		this.wisdom = wisdom;
		this.damageMultiplier = damageMultiplier;
	}
	
	// Methods
	public String sayWisdom() {
		return this.getWisdom();
		}
	
//	public void attack(Ninja enemy) {
//		System.out.println("[Sensei]");
//		System.out.println(this.getName() + " is attacking " + enemy.getName());
//		enemy.setHealth(enemy.getHealth() - this.getPowerLevel()*this.getDamageMultiplier());
//		System.out.println(enemy.getName() + " now has " + enemy.getHealth() + " hp left!!");
//
//	}

	
	
	// GETTERS & SETTERS
	public String getWisdom() {
		return wisdom;
	}
	public void setWisdom(String wisdom) {
		this.wisdom = wisdom;
	}
	public int getDamageMultiplier() {
		return damageMultiplier;
	}
	public void setDamageMultiplier(int damageMultiplier) {
		this.damageMultiplier = damageMultiplier;
	}
	
	
	

}
