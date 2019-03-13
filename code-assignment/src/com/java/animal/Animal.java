package com.java.animal;

/**
 * @author User abstract class - common functions added through interface
 */
public abstract class Animal implements MakeSound, CanMove {
	public abstract String sing();

	public abstract String move();
}
