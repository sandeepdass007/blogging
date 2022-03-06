package com.blogging.solid.after;

/*
 * CelerioCar representing Manual Version
 * */
public class CelerioManualCar extends ManualCar {

	@Override
	public void ignite() {
		System.out.println("Igniting...");
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

	@Override
	public void pressClutch() {
		System.out.println("Pressing clutch...");
	}

}
