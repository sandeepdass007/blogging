package com.blogging.designpattern.decorator;

public class DecoratorDemo {

	public static void main(String[] args) {
		// bread does not wrap any eatable item
		Bread bread = new Bread(null, 25.75f);
		
		// cake wraps the bread (eatable item)
		Cake cake = new Cake(bread, 100.25f);
		
		// price of cake should be it's  own base price + price of bread
		final Float price = cake.getPrice();
		System.out.println("Total price of cake - " + price);
	}

}
