package com.blogging.designpattern.singleton;

public final class SingletonLazyDemo {

	private static SingletonLazyDemo instance = null;

	private SingletonLazyDemo() {
		System.out.println("Creating new SingletonDemo instance...");
	}

	// lazy instantiation
	public static SingletonLazyDemo getInstance() {
		if (instance == null) {
			synchronized (SingletonLazyDemo.class) {
				if (instance == null) {
					instance = new SingletonLazyDemo();
				}
			}
		}
		return instance;
	}
}
