package com.java.animal.butterfly;

public class Butterfly extends Caterpillar {

	@Override
	public String move() {
		System.out.println("Fly");
		return "Fly";
	}

}
