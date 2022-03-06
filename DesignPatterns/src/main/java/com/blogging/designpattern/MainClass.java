package com.blogging.designpattern;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.blogging.designpattern.singleton.SingletonDemo;

public class MainClass {

	public static void main(String[] args) {
		demonstrateSingleton();
	}

	private static void demonstrateSingleton() {
		System.out.println("Initializing multiple threads...");
		final ExecutorService executorService = Executors.newFixedThreadPool(100);
		List<CompletableFuture<Void>> futures = new ArrayList<CompletableFuture<Void>>();
		for(int offset = 0; offset < 100; offset++) {
			futures.add(CompletableFuture.runAsync(() -> {
				System.out.println("Executing thread..." + Thread.currentThread().getName());
				SingletonDemo.getInstance();
			}, executorService));
		}
		CompletableFuture.allOf(futures.toArray(new CompletableFuture[futures.size()]));
		System.out.println("Completed");
	}

}
