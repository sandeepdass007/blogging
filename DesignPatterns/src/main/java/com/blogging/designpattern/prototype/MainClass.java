package com.blogging.designpattern.prototype;

public class MainClass {

	public static void main(String[] args) throws CloneNotSupportedException {
		// Creating a basic object for Indian provinces
		Province indianProvince = new Province("Empty", 0, 0, 0, "ASIA", "INDIA", 999954984, 988985897,
				156496442, 2.62f);
		
		// Clone the indianProvince object to keep all the information at country and continent level
		Province punjab = indianProvince.clone();
		// Modify the information related to province only
		punjab.setName("PUNJAB");
		punjab.setMalePopulation(5000000);
		punjab.setFemalePopulation(490000);
		punjab.setOtherPopulation(1500000);
		
		// Object is ready to use
		System.out.println("=========== PUNJAB ===========");
		System.out.println(punjab);
		
		// Clone the indianProvince object to keep all the information at country and continent level
		Province rajasthan = indianProvince.clone();
		// Modify the information related to province only
		rajasthan.setName("RAJASTHAN");
		rajasthan.setMalePopulation(5980000);
		rajasthan.setFemalePopulation(5790000);
		rajasthan.setOtherPopulation(2550000);
		
		// Object is ready to use
		System.out.println("=========== RAJASTHAN ===========");
		System.out.println(rajasthan);
	}

}
