package com.blogging.extendsimplements;

/**
 * Hypothetical representation of Male extending 
 * {@link HumanBeing} and implementing {@link HumanCapabilities}
 * @author Rajnish
 *
 */
public class Male extends HumanBeing implements HumanCapabilities{
	
	//name of the Male
	public String name;
	
	/**
	 * Constructing a Male
	 * @param name
	 */
	public Male(String name) {
		super();
		this.name = name;
		System.out.println(String.format("Introducing %s", name));
	}
	
	  
	/**
	 * Hypothetical representation of average walking speed 'miles per hour'. 
	 * @param speed
	 */
	@Override
	public void walking(int speed) {  
		
		System.out.println(String.format("He can walk at average speed of %d miles per hour.",speed));
	}
	
	  
	/**
	 * Hypothetical allowance of talking. 
	 * @param value
	 */
	@Override
	public void talking(boolean value) {
		System.out.println(String.format("He can Talk :  %b ",value));
	}
	
	/**
	 * Hypothetical representation of maximum running speed 'Km per hour'. 
	 * @param maxSpeed
	 */
	@Override
	public void running(int maxSpeed) {
		System.out.println(String.format("He can run max with the speed of %d  Km per hour." ,maxSpeed));
	}
	
	/**
	 * Setting weight of particular Male
	 * @param weight
	 */
	public void setWeight(int weight) {  
		System.out.println((String.format("His weight is %d Kg", weight)));
	}
   
	/**
	 * Displaying details of a Male
	 * 
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(String.format("Nose size is %d cm \n", getNoseSize()));
		builder.append(String.format("Eyes size is %d cm \n", getEyesSize()));
		builder.append(String.format("Eyes color is %s \n", getEyesColor()));
		builder.append(String.format("Ears size is %d cm \n", getEarsSize()));
		return builder.toString();
	}
}
