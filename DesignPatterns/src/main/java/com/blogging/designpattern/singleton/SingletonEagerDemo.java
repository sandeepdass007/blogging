package com.blogging.designpattern.singleton;

public final class SingletonEagerDemo {
	
	// eager instantiation
	private static SingletonEagerDemo instance = new SingletonEagerDemo();

	private SingletonEagerDemo() {
		// do nothing
	}
	
	public static SingletonEagerDemo getInstance() {
		return instance;
	}
	
}
