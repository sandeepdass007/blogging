package com.blogging.designpattern.objectpool;

public class MainClass {

	public static void main(String[] args) {
		MyDatabase myDatabase = new MyDatabase("url", "username", "password");
		for(int offset = 1; offset <= 10; offset++) {
			final int number = offset;
			new Thread(() -> {
				final String queryData = myDatabase.queryData("Query " + number);
				System.out.println(queryData);
			}).start();
		}
		
	}

}
