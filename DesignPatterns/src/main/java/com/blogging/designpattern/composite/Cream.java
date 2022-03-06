package com.blogging.designpattern.composite;

import java.util.LinkedList;
import java.util.List;

public class Cream implements Eatable {
	
	private Boolean eggless;
	private Float price;

	@Override
	public Boolean isEggless() {
		return eggless;
	}

	@Override
	public Float price() {
		return price;
	}

	private Cream() {
		super();
	}

	public Cream(Boolean eggless, Float price) {
		super();
		this.eggless = eggless;
		this.price = price;
	}
	
	@Override
	public String name() {
		return "Cream";
	}

	@Override
	public List<Eatable> items() {
		return new LinkedList<Eatable>();
	}
	
}
