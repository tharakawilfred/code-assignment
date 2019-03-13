package com.java.animal.fish;

import com.java.animal.Animal;

abstract class Fish extends Animal {

	private String color;
	private String size;

	public String move() {
		System.out.println("Swim");
		return "Swim";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
}
