package com.blogging.designpattern.decorator;

public class Bread implements Eatable {

	private Eatable eatable;
	private Float price;

	public Bread(Eatable eatable, Float price) {
		super();
		this.eatable = eatable;
		this.price = price;
	}

	@Override
	public Float getPrice() {
		return eatable == null // if eatable is null
				? price : // then return the price of current eatable i.e. Bread
					eatable.getPrice() + price; // else sum of Bread's price + wrapped eatable's price
	}

}
