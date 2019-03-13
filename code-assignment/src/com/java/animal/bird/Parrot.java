package com.java.animal.bird;

abstract class Parrot extends Bird {

	@Override
	public String move() {
		System.out.println("Fly");
		return "Fly";
	}

}
