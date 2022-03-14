package com.blogging.designpattern.decorator;

public class Cake implements Eatable {

	private Eatable eatable;
	private Float price;

	public Cake(Eatable eatable, Float price) {
		super();
		this.eatable = eatable;
		this.price = price;
	}

	@Override
	public Float getPrice() {
		return eatable == null // if eatable is null
				? price : // then return the price of current eatable i.e. Cake
					eatable.getPrice() + price; // else sum of Cake's price + wrapped eatable's price
	}

}
