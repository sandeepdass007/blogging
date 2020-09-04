package com.blogging;

import com.blogging.dao.AnalystDao;

public class DaoDemo {

	public static void main(String[] args) {
		DaoDemo obj = new DaoDemo();
		AnalystDao analystDao = obj.getAnalystById("peter@domain.com");
		System.out.println(String.format("name: %s, age: %d", analystDao.getName(), analystDao.getAge()));
	}

	private AnalystDao getAnalystById(String userId) {
		return new AnalystDao("Peter", userId, 32, false);
	}
}
