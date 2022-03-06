package com.blogging.extendsimplements;

/**
 * Hypothetical representation of Base Class
 * HumanBeing
 * @author Rajnish
 *
 */
public class HumanBeing {

	// Size of nose
	private int noseSize;

	// Size of eyes
	private int eyesSize;

	// Color of eyes
	private String eyesColor;

	// Size of ears
	private int earsSize;

	/* 
	 * Setters 
	 * */
	public void setNoseSize(int noseSize) {
		this.noseSize = noseSize;
	}

	public void setEyesSize(int eyesSize) {
		this.eyesSize = eyesSize;
	}

	public void setEyesColor(String eyesColor) {
		this.eyesColor = eyesColor;
	}

	public void setEarsSize(int earsSize) {
		this.earsSize = earsSize;
	}

	/*
	 * Getters
	 * */
	public int getNoseSize() {
		return noseSize;
	}

	public int getEyesSize() {
		return eyesSize;
	}

	public String getEyesColor() {
		return eyesColor;
	}

	public int getEarsSize() {
		return earsSize;
	}

}
