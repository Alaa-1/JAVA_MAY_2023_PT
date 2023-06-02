package com.alaa.abstractinterfaces;

public class Android extends Phone implements Sharable, ACPowerable  {

	public Android(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayInfo() {
		System.out.println(String.format("Google Assistant says: \n Version Number: %s \n Battery Percentage: %d \n Carrier: %s \n Ringtone: %s \n ",
				this.getVersionNumber(),
				this.getBatteryPercentage(),
				this.getCarrier(),
				this.getRingTone()));

	}

	@Override
	public void scan() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unPlug() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean checkPluggedIn() {
		// TODO Auto-generated method stub
		return false;
	}

}
