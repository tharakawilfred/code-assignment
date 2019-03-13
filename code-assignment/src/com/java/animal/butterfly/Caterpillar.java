package com.java.animal.butterfly;

import com.java.animal.Animal;

public class Caterpillar extends Animal {

	@Override
	public String move() {
		System.out.println("Walk");
		return "Walk";
	}

	@Override
	public String sing() {
		return null;
	}
}
