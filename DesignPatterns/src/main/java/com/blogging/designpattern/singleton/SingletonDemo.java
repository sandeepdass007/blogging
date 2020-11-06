package com.blogging.designpattern.singleton;

public class SingletonDemo {

	private static SingletonDemo instance = null;
	
	private SingletonDemo() {
		System.out.println("Creating new SingletonDemo instance...");
	}
	
	public static SingletonDemo getInstance() {
		synchronized(SingletonDemo.class) {
			if(instance == null) {
				instance = new SingletonDemo();
			}
		}
		return instance;
	}
}
