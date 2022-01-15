package com.blogging.solid.before;

/*
 * CelerioCar representing Automatic Version
 * */
public class CelerioATCar extends Car {

	@Override
	public void ignite() {
		System.out.println("Igniting...");
	}

	@Override
	public void pressClutch() {
		throw new RuntimeException("Automatic Cars do not have clutch!");
	}

	@Override
	public void increaseGear() {
		System.out.println("Changed gear up...");
	}

	@Override
	public void descreaseGear() {
		System.out.println("Changed gear down...");
	}

	@Override
	public void race() {
		System.out.println("Car running...");
	}

}
