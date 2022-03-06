package com.blogging.designpattern.composite;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class TopLayer implements Eatable {

	private final List<Eatable> ingredients = new LinkedList<Eatable>();

	@Override
	public Boolean isEggless() {
		return ingredients.stream().allMatch(eatable -> eatable.isEggless());
	}

	@Override
	public Float price() {
		final Double totalPrice = ingredients.stream().collect(Collectors.summingDouble(item -> item.price()));
		return totalPrice.floatValue();
	}
	
	public void addItem(Eatable eatable) {
		ingredients.add(eatable);
	}

	@Override
	public String name() {
		return "Top Layer";
	}

	@Override
	public List<Eatable> items() {
		return ingredients;
	}

}
