package com.blogging.designpattern.composite;

public class CompositeDesignPatternDemo {

	public static void main(String[] args) {
		Cake cake = new Cake();
		TopLayer topLayer = getTopLayer();
		BottomLayer bottomLayer = getBottomLayer();
		cake.addItem(topLayer);
		cake.addItem(bottomLayer);
		displayAllDetails(cake);
	}

	private static void displayAllDetails(Eatable eatable) {
		if (eatable.items().isEmpty()) {
			displayItemDetails(eatable);
		} else {
			displayItemDetails(eatable);
			eatable.items().forEach(CompositeDesignPatternDemo::displayAllDetails);
		}
	}

	private static void displayItemDetails(Eatable eatable) {
		System.out.println("************************************");
		System.out.println("Eatable name - " + eatable.name());
		System.out.println("Eatable eggless - " + eatable.isEggless());
		System.out.println("Eatable price - " + eatable.price());
		System.out.println();
	}

	private static BottomLayer getBottomLayer() {
		BottomLayer bottomLayer = new BottomLayer();
		final Boolean eggless = new Boolean(true);
		final Float price = new Float(255.85f);
		final Bread bread = new Bread(eggless, price);
		bottomLayer.addItem(bread);
		return bottomLayer;
	}

	private static TopLayer getTopLayer() {
		TopLayer topLayer = new TopLayer();
		final Boolean eggless = new Boolean(false);
		final Float price = new Float(75.25f);
		final Cream cream = new Cream(eggless, price);
		topLayer.addItem(cream);
		return topLayer;
	}

}
