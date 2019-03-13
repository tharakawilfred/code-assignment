package com.java.animal.bird;

public class Duck extends Bird {

	@Override
	public String sing() {
		System.out.println("Quack, quack");
		return "Quack quack";

	}

	@Override
	public String move() {
		System.out.println("Swim");
		return "Swim";
	}

}
