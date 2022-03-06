package com.blogging.java8.thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalDemo {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		for(int offset = 0; offset < 20; offset++) {
			executorService.submit(() -> {
				System.out.println(Thread.currentThread().getName() + ": " + new ThreadLocalDemo().getBirthDate());
			});
		}
	}
	
	private String getBirthDate() {
		// for each thread, their SimpleDateFormat would be separate as we defined it as thread local.
		SimpleDateFormat format = ThreadLocalDateFormatter.dateFormat.get();
		return format.format(new Date());
	}

}
