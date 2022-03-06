package com.blogging.java8.thread;

import java.text.SimpleDateFormat;

public class ThreadLocalDateFormatter {
	/*
	 * 
	 Before Java 8
	public static ThreadLocal<SimpleDateFormat> dateFormat = new ThreadLocal<SimpleDateFormat>() {
		@Override
		protected SimpleDateFormat initialValue() {
			return new SimpleDateFormat("yyyy-MM-dd");
		}
		
		@Override
		public SimpleDateFormat get() {
			return super.get();
		}
	};
	 */
	
	public static ThreadLocal<SimpleDateFormat> dateFormat = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd"));
}
