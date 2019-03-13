package com.java.animal.bird;

public class Rooster extends Bird {

	@Override
	public String sing() {
		System.out.println("Cock-a-doodle-doo");
		return "Cock-a-doodle-doo";

	}

	@Override
	public String move() {
		System.out.println("Walk");
		return "Walk";
	}

}
