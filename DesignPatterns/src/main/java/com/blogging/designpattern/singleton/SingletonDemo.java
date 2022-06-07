package com.blogging.designpattern.singleton;

public final class SingletonDemo {

	private static SingletonDemo instance = null;

	private SingletonDemo() {
		System.out.println("Creating new SingletonDemo instance...");
	}

	// lazy instantiation
	public static SingletonDemo getInstance() {
		if (instance == null) {
			synchronized (SingletonDemo.class) {
				if (instance == null) {
					instance = new SingletonDemo();
				}
			}
		}
		return instance;
	}
}
