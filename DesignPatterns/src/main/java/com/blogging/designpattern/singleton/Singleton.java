package com.blogging.designpattern.singleton;

public final class Singleton {
	
	// eager instantiation
	private static Singleton instance = new Singleton();

	private Singleton() {
		// do nothing
	}
	
	public static Singleton getInstance() {
		return instance;
	}
	
}
