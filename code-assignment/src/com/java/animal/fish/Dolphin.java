package com.java.animal.fish;

import com.java.animal.Animal;

public class Dolphin extends Animal {

	@Override
	public String move() {
		System.out.println("Swim");
		return "Swim";
	}

	@Override
	public String sing() {
		return null;
	}

}
