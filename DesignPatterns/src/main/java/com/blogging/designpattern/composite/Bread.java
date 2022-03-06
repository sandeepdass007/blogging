package com.blogging.designpattern.composite;

import java.util.LinkedList;
import java.util.List;

public class Bread implements Eatable {
	
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

	private Bread() {
		super();
	}

	public Bread(Boolean eggless, Float price) {
		super();
		this.eggless = eggless;
		this.price = price;
	}
	
	@Override
	public String name() {
		return "Bread";
	}

	@Override
	public List<Eatable> items() {
		return new LinkedList<Eatable>();
	}
	
}
