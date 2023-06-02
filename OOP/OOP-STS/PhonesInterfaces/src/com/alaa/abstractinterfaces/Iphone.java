package com.alaa.abstractinterfaces;

public class Iphone extends Phone {

	public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayInfo() {
		System.out.println(String.format("Siri says: \n Version Number: %s \n Battery Percentage: %d \n Carrier: %s \n Ringtone: %s \n ",
				this.getVersionNumber(),
				this.getBatteryPercentage(),
				this.getCarrier(),
				this.getRingTone()));
		
	}

	
}
