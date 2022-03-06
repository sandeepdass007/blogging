package com.blogging.extendsimplements;

/**
 * Demonstrating usage of extends and implements keyword for better understanding
 * @author Rajnish
 *
 */
public class ExtendsImplementsDemo {

	public static void main(String[] args) {
		 
		//  Constructing a Male with name "HARRY"
		Male male = new Male ("HARRY");
		
		/*
		 * Setting values as:
		 *  setNoseSize -> 2
		 *  setEyesSize -> 5
		 *  setEyesColor ->'Brown'
		 *  setWeight -> 45
		 * */
		male.setNoseSize(2);
		male.setEyesSize(5);
		male.setEyesColor("Brown");
		male.setEarsSize(3);
		male.setWeight(45);
		System.out.println(male);
		
		male.walking(3);
		male.talking(true);
		male.running(43);
	}

}
